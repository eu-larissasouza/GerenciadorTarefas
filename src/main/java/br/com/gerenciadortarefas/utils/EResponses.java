package br.com.gerenciadortarefas.utils;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum EResponses {
    FOLLOWERS_NOT_FOUND("Não foram localizados seguidores para o vendedor informado."),
    FOLLOWING_NOT_FOUND("Não foram localizados os vendedores que este usuário está seguindo."),
    ALREADY_NOT_FOLLOWING("O usuário informado ainda não está seguindo nenhum vendedor."),
    ALREADY_FOLLOW_SELLER("Este vendedor já está na listagem de seguidos."),
    SELLER_NOT_FOUND("O vendedor informado não foi localizado. "),
    BUYER_NOT_FOUND("O usuário informado não foi localizado. "),
    PROMO_POST_NOTFOUND("Não foram localizados produtos em promoção.")
    ,
    USERS_NOT_FOUND("Nenhum usuário foi encontrado."),
    USER_NOT_FOUND("Usuário não encontrado para o ID: "),
    INVALID_ORDER("Ordenação inválida. Os valores aceitos são: ");

    private final String message;
}
