package service;

import java.util.ArrayList;

import dto.PaisDTO;
import retrofit2.Call;
import retrofit2.http.GET;

public interface IPais {
    @GET("api/paises")
    Call<ArrayList<PaisDTO>> getPaisDtoCall();
}