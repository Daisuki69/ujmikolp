package retrofit2.converter.gson;

import com.google.gson.JsonIOException;
import com.google.gson.j;
import com.google.gson.y;
import j3.a;
import java.io.IOException;
import java.io.Reader;
import okhttp3.ResponseBody;
import retrofit2.Converter;

/* JADX INFO: loaded from: classes5.dex */
final class GsonResponseBodyConverter<T> implements Converter<ResponseBody, T> {
    private final y adapter;
    private final j gson;

    public GsonResponseBodyConverter(j jVar, y yVar) {
        this.gson = jVar;
        this.adapter = yVar;
    }

    @Override // retrofit2.Converter
    public T convert(ResponseBody responseBody) throws IOException {
        j jVar = this.gson;
        Reader readerCharStream = responseBody.charStream();
        jVar.getClass();
        a aVar = new a(readerCharStream);
        int i = jVar.m;
        if (i == 0) {
            i = 2;
        }
        aVar.M(i);
        try {
            T t5 = (T) this.adapter.read(aVar);
            if (aVar.peek() == 10) {
                return t5;
            }
            throw new JsonIOException("JSON document was not fully consumed.");
        } finally {
            responseBody.close();
        }
    }
}
