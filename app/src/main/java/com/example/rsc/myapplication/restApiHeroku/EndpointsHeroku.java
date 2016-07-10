package com.example.rsc.myapplication.restApiHeroku;

import com.example.rsc.myapplication.restApiHeroku.model.UsuarioResponse;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;


public interface EndpointsHeroku {

    @FormUrlEncoded
    @POST(ConstantesRestApiHeroku.KEY_POST_REG_USUARIO)
    Call<UsuarioResponse> registrarTokenID(@Field("id_dispositivo") String idDispo, @Field("id_usuario_instagram") String idUsuInstagram);
}
