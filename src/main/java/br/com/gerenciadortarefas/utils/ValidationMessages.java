package br.com.gerenciadortarefas.utils;

public class ValidationMessages {

    // ProductDto
    public static final String PRODUCT_NAME_INVALID = "O nome do produto não pode conter caracteres especiais.";
    public static final String PRODUCT_TYPE_NOT_NULL = "O tipo do produto não pode estar vazio.";
    public static final String PRODUCT_TYPE_LENGTH = "O tipo do produto deve ter no máximo 15 caracteres.";
    public static final String PRODUCT_TYPE_INVALID = "O tipo do produto não pode conter caracteres especiais.";
    public static final String PRODUCT_BRAND_NOT_NULL = "A marca do produto não pode estar vazia.";
    public static final String PRODUCT_BRAND_LENGTH = "A marca do produto deve ter no máximo 25 caracteres.";
    public static final String PRODUCT_BRAND_INVALID = "A marca do produto não pode conter caracteres especiais.";
    public static final String PRODUCT_COLOR_NOT_NULL = "A cor do produto não pode estar vazia.";
    public static final String PRODUCT_COLOR_LENGTH = "A cor do produto deve ter no máximo 15 caracteres.";
    public static final String PRODUCT_COLOR_INVALID = "A cor do produto não pode conter caracteres especiais.";
    public static final String PRODUCT_NOTES_LENGTH = "As notas do produto devem ter no máximo 80 caracteres.";
    public static final String PRODUCT_NOTES_INVALID = "As notas do produto não podem conter caracteres especiais.";

    // PostRequestDto
    public static final String USER_ID_NOT_NULL = "O id não pode estar vazio.";
    public static final String USER_ID_POSITIVE = "O id deve ser maior que zero.";
    public static final String DATE_NOT_NULL = "A data não pode estar vazia.";
    public static final String PRODUCT_NOT_NULL = "O produto não pode ser nulo.";
    public static final String CATEGORY_NOT_NULL = "O campo não pode estar vazio.";
    public static final String PRICE_NOT_NULL = "O campo não pode estar vazio.";
    public static final String PRICE_MAX_LIMIT = "O preço máximo por produto é de 10.000.000";

    // FollowSellerDto
    public static final String BUYER_ID_NOT_NULL = "O buyerId não pode ser nulo.";
    public static final String BUYER_ID_POSITIVE = "O buyerId deve ser maior que zero.";
    public static final String SELLER_ID_NOT_NULL = "O sellerId não pode ser nulo.";
    public static final String SELLER_ID_POSITIVE = "O sellerId deve ser maior que zero.";

    // UsuarioRequestDto
    public static final String USER_NAME_NOT_BLANK = "O nome do usuário não pode estar vazio.";
    public static final String USER_NAME_LENGTH = "O nome do usuário deve ter no máximo 20 caracteres.";
    public static final String USER_NAME_INVALID = "O nome do usuário não pode conter caracteres especiais.";
    public static final String USER_EMAIL_NOT_NULL = "O email do usuário não pode estar vazio.";
    public static final String USER_EMAIL_INVALID = "O email do usuário deve ser válido.";
}