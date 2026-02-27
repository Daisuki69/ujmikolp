package retrofit2.converter.gson;

import com.google.gson.j;
import com.google.gson.reflect.TypeToken;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Converter;
import retrofit2.Retrofit;

/* JADX INFO: loaded from: classes5.dex */
public final class GsonConverterFactory extends Converter.Factory {
    private final j gson;
    private final boolean streaming;

    private GsonConverterFactory(j jVar, boolean z4) {
        this.gson = jVar;
        this.streaming = z4;
    }

    public static GsonConverterFactory create() {
        return create(new j());
    }

    @Override // retrofit2.Converter.Factory
    public Converter<?, RequestBody> requestBodyConverter(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, Retrofit retrofit) {
        return new GsonRequestBodyConverter(this.gson, this.gson.g(TypeToken.get(type)), this.streaming);
    }

    @Override // retrofit2.Converter.Factory
    public Converter<ResponseBody, ?> responseBodyConverter(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        return new GsonResponseBodyConverter(this.gson, this.gson.g(TypeToken.get(type)));
    }

    public GsonConverterFactory withStreaming() {
        return new GsonConverterFactory(this.gson, true);
    }

    public static GsonConverterFactory create(j jVar) {
        if (jVar != null) {
            return new GsonConverterFactory(jVar, false);
        }
        throw new NullPointerException("gson == null");
    }
}
