package br.com.example.mobile.carregaquiapp.service;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.example.mobile.carregaquiapp.model.Usuario;

public class UsuarioService {

    private static final String URL = "https://openws.org/api/collections/carregaqui";
    //private static final String API_KEY = "?apiKey=1a2b3c4d5e6f7g8h9i10j11k12l13m";

    public List<Usuario> getAll() {
        List<Usuario> user = new ArrayList();
        HttpURLConnection urlConnection = null;

        try {
            URL url = new URL(URL);
            urlConnection = (HttpURLConnection) url.openConnection();

            InputStream in = new BufferedInputStream(urlConnection.getInputStream());
            Scanner s = new Scanner(in);
            String conteudo = s.useDelimiter("\\A").next();
//            Gson gson = new Gson();
//            user = gson.fromJson(conteudo, new TypeToken<List<Usuario>>(){}.getType());
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            urlConnection.disconnect();
        }
        return user;
    }

    public void post(Usuario user) {
        HttpURLConnection urlConnection = null;
        try {
            URL url = new URL(URL);

            urlConnection = (HttpURLConnection) url.openConnection();
            urlConnection.setDoOutput(true);
            urlConnection.setRequestMethod("POST");
            urlConnection.setRequestProperty("Content-Type", "application/json");
            urlConnection.setRequestProperty("Accept", "application/json");
            OutputStream out = new BufferedOutputStream(urlConnection.getOutputStream());
            Writer w = new BufferedWriter(new OutputStreamWriter(out));
//            Gson gson = new Gson();
//            String json = gson.toJson(user);
//            w.write(json);
            w.close();
            InputStream in = new BufferedInputStream(urlConnection.getInputStream());
            Scanner s = new Scanner(in);
            String conteudo = s.nextLine();
            in.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            urlConnection.disconnect();
        }
    }

    public void delete(String id) {
        HttpURLConnection urlConnection = null;

        try {
            URL url = new URL(URL + "/" + id);
            urlConnection = (HttpURLConnection) url.openConnection();
            urlConnection.setRequestMethod("DELETE");
            InputStream in = new BufferedInputStream(urlConnection.getInputStream());
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            urlConnection.disconnect();
        }
    }
}