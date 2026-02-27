package io.flutter.plugins.sharedpreferences;

import androidx.media3.extractor.ts.TsExtractor;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.List;
import kotlin.jvm.internal.j;
import pg.C2037D;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes4.dex */
public class MessagesAsyncPigeonCodec extends C2037D {
    @Override // pg.C2037D
    public Object readValueOfType(byte b8, ByteBuffer buffer) {
        j.g(buffer, "buffer");
        if (b8 == -127) {
            Long l6 = (Long) readValue(buffer);
            if (l6 != null) {
                return StringListLookupResultType.Companion.ofRaw((int) l6.longValue());
            }
            return null;
        }
        if (b8 == -126) {
            Object value = readValue(buffer);
            List<? extends Object> list = value instanceof List ? (List) value : null;
            if (list != null) {
                return SharedPreferencesPigeonOptions.Companion.fromList(list);
            }
            return null;
        }
        if (b8 != -125) {
            return super.readValueOfType(b8, buffer);
        }
        Object value2 = readValue(buffer);
        List<? extends Object> list2 = value2 instanceof List ? (List) value2 : null;
        if (list2 != null) {
            return StringListResult.Companion.fromList(list2);
        }
        return null;
    }

    @Override // pg.C2037D
    public void writeValue(ByteArrayOutputStream stream, Object obj) {
        j.g(stream, "stream");
        if (obj instanceof StringListLookupResultType) {
            stream.write(TsExtractor.TS_STREAM_TYPE_AC3);
            writeValue(stream, Integer.valueOf(((StringListLookupResultType) obj).getRaw()));
        } else if (obj instanceof SharedPreferencesPigeonOptions) {
            stream.write(130);
            writeValue(stream, ((SharedPreferencesPigeonOptions) obj).toList());
        } else if (!(obj instanceof StringListResult)) {
            super.writeValue(stream, obj);
        } else {
            stream.write(131);
            writeValue(stream, ((StringListResult) obj).toList());
        }
    }
}
