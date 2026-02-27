package defpackage;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.io.IOException;
import kotlin.jvm.internal.j;
import okio.ByteString;

/* JADX INFO: loaded from: classes5.dex */
public final class p0 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader reader) throws IOException {
        j.g(reader, "reader");
        long jBeginMessage = reader.beginMessage();
        String strDecode = "";
        long jLongValue = 0;
        while (true) {
            int iNextTag = reader.nextTag();
            if (iNextTag == -1) {
                return new Register(strDecode, jLongValue, reader.endMessageAndGetUnknownFields(jBeginMessage));
            }
            if (iNextTag == 1) {
                strDecode = ProtoAdapter.STRING.decode(reader);
            } else if (iNextTag != 2) {
                reader.readUnknownField(iNextTag);
            } else {
                jLongValue = ProtoAdapter.UINT64.decode(reader).longValue();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter writer, Object obj) throws IOException {
        Register value = (Register) obj;
        j.g(writer, "writer");
        j.g(value, "value");
        if (!j.b(value.getName(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 1, value.getName());
        }
        if (value.getU64() != 0) {
            ProtoAdapter.UINT64.encodeWithTag(writer, 2, Long.valueOf(value.getU64()));
        }
        writer.writeBytes(value.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Register value = (Register) obj;
        j.g(value, "value");
        int size = value.unknownFields().size();
        if (!j.b(value.getName(), "")) {
            size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getName());
        }
        return value.getU64() != 0 ? ProtoAdapter.UINT64.encodedSizeWithTag(2, Long.valueOf(value.getU64())) + size : size;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Register value = (Register) obj;
        j.g(value, "value");
        return Register.copy$default(value, null, 0L, ByteString.EMPTY, 3, null);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter writer, Object obj) throws IOException {
        Register value = (Register) obj;
        j.g(writer, "writer");
        j.g(value, "value");
        writer.writeBytes(value.unknownFields());
        if (value.getU64() != 0) {
            ProtoAdapter.UINT64.encodeWithTag(writer, 2, Long.valueOf(value.getU64()));
        }
        if (j.b(value.getName(), "")) {
            return;
        }
        ProtoAdapter.STRING.encodeWithTag(writer, 1, value.getName());
    }
}
