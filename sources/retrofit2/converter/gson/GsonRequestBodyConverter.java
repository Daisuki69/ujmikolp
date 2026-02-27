package retrofit2.converter.gson;

import com.google.gson.j;
import com.google.gson.y;
import j3.b;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okio.Buffer;
import okio.BufferedSink;
import retrofit2.Converter;

/* JADX INFO: loaded from: classes5.dex */
final class GsonRequestBodyConverter<T> implements Converter<T, RequestBody> {
    static final MediaType MEDIA_TYPE = MediaType.get("application/json; charset=UTF-8");
    private final y adapter;
    private final j gson;
    private final boolean streaming;

    public GsonRequestBodyConverter(j jVar, y yVar, boolean z4) {
        this.gson = jVar;
        this.adapter = yVar;
        this.streaming = z4;
    }

    public static <T> void writeJson(BufferedSink bufferedSink, j jVar, y yVar, T t5) throws IOException {
        b bVarJ = jVar.j(new OutputStreamWriter(bufferedSink.outputStream(), StandardCharsets.UTF_8));
        yVar.write(bVarJ, t5);
        bVarJ.close();
    }

    @Override // retrofit2.Converter
    public RequestBody convert(T t5) throws IOException {
        if (this.streaming) {
            return new GsonStreamingRequestBody(this.gson, this.adapter, t5);
        }
        Buffer buffer = new Buffer();
        writeJson(buffer, this.gson, this.adapter, t5);
        return RequestBody.create(MEDIA_TYPE, buffer.readByteString());
    }
}
