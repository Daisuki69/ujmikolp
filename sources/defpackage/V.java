package defpackage;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.io.IOException;
import kotlin.jvm.internal.j;
import okio.ByteString;

/* JADX INFO: loaded from: classes5.dex */
public final class V extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader reader) throws IOException {
        j.g(reader, "reader");
        long jBeginMessage = reader.beginMessage();
        String strDecode = "";
        String strDecode2 = "";
        int iIntValue = 0;
        int iIntValue2 = 0;
        int iIntValue3 = 0;
        String strDecode3 = strDecode2;
        while (true) {
            int iNextTag = reader.nextTag();
            if (iNextTag == -1) {
                return new LogMessage(strDecode, iIntValue, iIntValue2, iIntValue3, strDecode3, strDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
            }
            switch (iNextTag) {
                case 1:
                    strDecode = ProtoAdapter.STRING.decode(reader);
                    break;
                case 2:
                    iIntValue = ProtoAdapter.UINT32.decode(reader).intValue();
                    break;
                case 3:
                    iIntValue2 = ProtoAdapter.UINT32.decode(reader).intValue();
                    break;
                case 4:
                    iIntValue3 = ProtoAdapter.UINT32.decode(reader).intValue();
                    break;
                case 5:
                    strDecode3 = ProtoAdapter.STRING.decode(reader);
                    break;
                case 6:
                    strDecode2 = ProtoAdapter.STRING.decode(reader);
                    break;
                default:
                    reader.readUnknownField(iNextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter writer, Object obj) throws IOException {
        LogMessage value = (LogMessage) obj;
        j.g(writer, "writer");
        j.g(value, "value");
        if (!j.b(value.getTimestamp(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 1, value.getTimestamp());
        }
        if (value.getPid() != 0) {
            ProtoAdapter.UINT32.encodeWithTag(writer, 2, Integer.valueOf(value.getPid()));
        }
        if (value.getTid() != 0) {
            ProtoAdapter.UINT32.encodeWithTag(writer, 3, Integer.valueOf(value.getTid()));
        }
        if (value.getPriority() != 0) {
            ProtoAdapter.UINT32.encodeWithTag(writer, 4, Integer.valueOf(value.getPriority()));
        }
        if (!j.b(value.getTag(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 5, value.getTag());
        }
        if (!j.b(value.getMessage(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 6, value.getMessage());
        }
        writer.writeBytes(value.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LogMessage value = (LogMessage) obj;
        j.g(value, "value");
        int size = value.unknownFields().size();
        if (!j.b(value.getTimestamp(), "")) {
            size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getTimestamp());
        }
        if (value.getPid() != 0) {
            size += ProtoAdapter.UINT32.encodedSizeWithTag(2, Integer.valueOf(value.getPid()));
        }
        if (value.getTid() != 0) {
            size += ProtoAdapter.UINT32.encodedSizeWithTag(3, Integer.valueOf(value.getTid()));
        }
        if (value.getPriority() != 0) {
            size += ProtoAdapter.UINT32.encodedSizeWithTag(4, Integer.valueOf(value.getPriority()));
        }
        if (!j.b(value.getTag(), "")) {
            size += ProtoAdapter.STRING.encodedSizeWithTag(5, value.getTag());
        }
        return !j.b(value.getMessage(), "") ? ProtoAdapter.STRING.encodedSizeWithTag(6, value.getMessage()) + size : size;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LogMessage value = (LogMessage) obj;
        j.g(value, "value");
        return LogMessage.copy$default(value, null, 0, 0, 0, null, null, ByteString.EMPTY, 63, null);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter writer, Object obj) throws IOException {
        LogMessage value = (LogMessage) obj;
        j.g(writer, "writer");
        j.g(value, "value");
        writer.writeBytes(value.unknownFields());
        if (!j.b(value.getMessage(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 6, value.getMessage());
        }
        if (!j.b(value.getTag(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 5, value.getTag());
        }
        if (value.getPriority() != 0) {
            ProtoAdapter.UINT32.encodeWithTag(writer, 4, Integer.valueOf(value.getPriority()));
        }
        if (value.getTid() != 0) {
            ProtoAdapter.UINT32.encodeWithTag(writer, 3, Integer.valueOf(value.getTid()));
        }
        if (value.getPid() != 0) {
            ProtoAdapter.UINT32.encodeWithTag(writer, 2, Integer.valueOf(value.getPid()));
        }
        if (j.b(value.getTimestamp(), "")) {
            return;
        }
        ProtoAdapter.STRING.encodeWithTag(writer, 1, value.getTimestamp());
    }
}
