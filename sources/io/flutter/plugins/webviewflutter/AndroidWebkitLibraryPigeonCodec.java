package io.flutter.plugins.webviewflutter;

import androidx.media3.extractor.ts.TsExtractor;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import pg.C2037D;

/* JADX INFO: loaded from: classes4.dex */
class AndroidWebkitLibraryPigeonCodec extends C2037D {
    @Override // pg.C2037D
    public Object readValueOfType(byte b8, ByteBuffer buffer) {
        kotlin.jvm.internal.j.g(buffer, "buffer");
        if (b8 == -127) {
            Long l6 = (Long) readValue(buffer);
            if (l6 == null) {
                return null;
            }
            return FileChooserMode.Companion.ofRaw((int) l6.longValue());
        }
        if (b8 == -126) {
            Long l8 = (Long) readValue(buffer);
            if (l8 == null) {
                return null;
            }
            return ConsoleMessageLevel.Companion.ofRaw((int) l8.longValue());
        }
        if (b8 == -125) {
            Long l10 = (Long) readValue(buffer);
            if (l10 == null) {
                return null;
            }
            return OverScrollMode.Companion.ofRaw((int) l10.longValue());
        }
        if (b8 == -124) {
            Long l11 = (Long) readValue(buffer);
            if (l11 == null) {
                return null;
            }
            return SslErrorType.Companion.ofRaw((int) l11.longValue());
        }
        if (b8 != -123) {
            return super.readValueOfType(b8, buffer);
        }
        Long l12 = (Long) readValue(buffer);
        if (l12 == null) {
            return null;
        }
        return MixedContentMode.Companion.ofRaw((int) l12.longValue());
    }

    @Override // pg.C2037D
    public void writeValue(ByteArrayOutputStream stream, Object obj) {
        kotlin.jvm.internal.j.g(stream, "stream");
        if (obj instanceof FileChooserMode) {
            stream.write(TsExtractor.TS_STREAM_TYPE_AC3);
            writeValue(stream, Integer.valueOf(((FileChooserMode) obj).getRaw()));
            return;
        }
        if (obj instanceof ConsoleMessageLevel) {
            stream.write(130);
            writeValue(stream, Integer.valueOf(((ConsoleMessageLevel) obj).getRaw()));
            return;
        }
        if (obj instanceof OverScrollMode) {
            stream.write(131);
            writeValue(stream, Integer.valueOf(((OverScrollMode) obj).getRaw()));
        } else if (obj instanceof SslErrorType) {
            stream.write(132);
            writeValue(stream, Integer.valueOf(((SslErrorType) obj).getRaw()));
        } else if (!(obj instanceof MixedContentMode)) {
            super.writeValue(stream, obj);
        } else {
            stream.write(133);
            writeValue(stream, Integer.valueOf(((MixedContentMode) obj).getRaw()));
        }
    }
}
