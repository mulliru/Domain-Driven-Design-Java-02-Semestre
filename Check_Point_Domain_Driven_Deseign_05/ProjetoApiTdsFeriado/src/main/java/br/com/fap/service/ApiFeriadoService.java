package br.com.fap.service;

import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

import com.google.gson.Gson;

import br.com.fiap.model.Feriado;

public class ApiFeriadoService {

	public Feriado[] getFeriados(String ano) throws ClientProtocolException, IOException {

		Feriado[] feriados = null;

		// Request
		HttpGet request = new HttpGet("https://brasilapi.com.br/api/feriados/v1/" + ano);

		try (CloseableHttpClient httpClient = HttpClientBuilder.create().disableRedirectHandling().build();
				CloseableHttpResponse response = httpClient.execute(request)) {
			HttpEntity entity = response.getEntity();

			if (entity != null) {
				String result = EntityUtils.toString(entity);
				Gson gson = new Gson();
				feriados = gson.fromJson(result, Feriado[].class);
			}
		}
		return feriados;
	}
}
