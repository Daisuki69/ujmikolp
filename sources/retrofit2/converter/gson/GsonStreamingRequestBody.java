package retrofit2.converter.gson;

import com.google.gson.j;
import com.google.gson.y;
import java.io.IOException;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okio.BufferedSink;

/* JADX INFO: loaded from: classes5.dex */
final class GsonStreamingRequestBody<T> extends RequestBody {
    private final y adapter;
    private final j gson;
    private final T value;

    public GsonStreamingRequestBody(j jVar, y yVar, T t5) {
        this.gson = jVar;
        this.adapter = yVar;
        this.value = t5;
    }

    @Override // okhttp3.RequestBody
    public MediaType contentType() {
        return GsonRequestBodyConverter.MEDIA_TYPE;
    }

    @Override // okhttp3.RequestBody
    public void writeTo(BufferedSink bufferedSink) throws IOException {
        GsonRequestBodyConverter.writeJson(bufferedSink, this.gson, this.adapter, this.value);
    }
}
