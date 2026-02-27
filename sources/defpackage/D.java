package defpackage;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.io.IOException;
import kotlin.jvm.internal.j;
import okio.ByteString;

/* JADX INFO: loaded from: classes3.dex */
public final class D extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader reader) throws IOException {
        j.g(reader, "reader");
        long jBeginMessage = reader.beginMessage();
        String strDecode = null;
        Long lDecode = null;
        while (true) {
            int iNextTag = reader.nextTag();
            if (iNextTag == -1) {
                return new Extractor(strDecode, lDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
            }
            if (iNextTag == 1) {
                strDecode = ProtoAdapter.STRING.decode(reader);
            } else if (iNextTag != 2) {
                reader.readUnknownField(iNextTag);
            } else {
                lDecode = ProtoAdapter.INT64.decode(reader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter writer, Object obj) throws IOException {
        Extractor value = (Extractor) obj;
        j.g(writer, "writer");
        j.g(value, "value");
        ProtoAdapter.STRING.encodeWithTag(writer, 1, value.getExtractor());
        ProtoAdapter.INT64.encodeWithTag(writer, 2, value.getDuration());
        writer.writeBytes(value.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Extractor value = (Extractor) obj;
        j.g(value, "value");
        return ProtoAdapter.INT64.encodedSizeWithTag(2, value.getDuration()) + ProtoAdapter.STRING.encodedSizeWithTag(1, value.getExtractor()) + value.unknownFields().size();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Extractor value = (Extractor) obj;
        j.g(value, "value");
        return Extractor.copy$default(value, null, null, ByteString.EMPTY, 3, null);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter writer, Object obj) throws IOException {
        Extractor value = (Extractor) obj;
        j.g(writer, "writer");
        j.g(value, "value");
        writer.writeBytes(value.unknownFields());
        ProtoAdapter.INT64.encodeWithTag(writer, 2, value.getDuration());
        ProtoAdapter.STRING.encodeWithTag(writer, 1, value.getExtractor());
    }
}
