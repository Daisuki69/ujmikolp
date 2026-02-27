package defpackage;

import androidx.media3.extractor.ts.TsExtractor;
import cj.r;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.List;
import kotlin.jvm.internal.j;
import pg.C2037D;

/* JADX INFO: loaded from: classes5.dex */
public final class J0 extends C2037D {
    @Override // pg.C2037D
    public final Object readValueOfType(byte b8, ByteBuffer byteBuffer) {
        if (b8 == -127) {
            Object value = readValue(byteBuffer);
            List list = value instanceof List ? (List) value : null;
            if (list != null) {
                return new B0((Boolean) list.get(0));
            }
        } else {
            if (b8 != -126) {
                return super.readValueOfType(b8, byteBuffer);
            }
            Object value2 = readValue(byteBuffer);
            List list2 = value2 instanceof List ? (List) value2 : null;
            if (list2 != null) {
                return new P((Boolean) list2.get(0));
            }
        }
        return null;
    }

    @Override // pg.C2037D
    public final void writeValue(ByteArrayOutputStream stream, Object obj) {
        j.g(stream, "stream");
        if (obj instanceof B0) {
            stream.write(TsExtractor.TS_STREAM_TYPE_AC3);
            writeValue(stream, r.c(((B0) obj).f334a));
        } else if (!(obj instanceof P)) {
            super.writeValue(stream, obj);
        } else {
            stream.write(130);
            writeValue(stream, r.c(((P) obj).f4896a));
        }
    }
}
