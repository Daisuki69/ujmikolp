package defpackage;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.io.IOException;
import kotlin.jvm.internal.j;
import okio.ByteString;

/* JADX INFO: loaded from: classes3.dex */
public final class F extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader reader) throws IOException {
        j.g(reader, "reader");
        long jBeginMessage = reader.beginMessage();
        String strDecode = "";
        long jLongValue = 0;
        int iIntValue = 0;
        String strDecode2 = "";
        while (true) {
            long j = jLongValue;
            while (true) {
                int iNextTag = reader.nextTag();
                if (iNextTag == -1) {
                    return new FD(iIntValue, strDecode, strDecode2, j, reader.endMessageAndGetUnknownFields(jBeginMessage));
                }
                if (iNextTag == 1) {
                    iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                } else if (iNextTag == 2) {
                    strDecode = ProtoAdapter.STRING.decode(reader);
                } else if (iNextTag == 3) {
                    strDecode2 = ProtoAdapter.STRING.decode(reader);
                } else if (iNextTag != 4) {
                    reader.readUnknownField(iNextTag);
                }
            }
            jLongValue = ProtoAdapter.UINT64.decode(reader).longValue();
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter writer, Object obj) throws IOException {
        FD value = (FD) obj;
        j.g(writer, "writer");
        j.g(value, "value");
        if (value.getFd() != 0) {
            ProtoAdapter.INT32.encodeWithTag(writer, 1, Integer.valueOf(value.getFd()));
        }
        if (!j.b(value.getPath(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 2, value.getPath());
        }
        if (!j.b(value.getOwner(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 3, value.getOwner());
        }
        if (value.getTag() != 0) {
            ProtoAdapter.UINT64.encodeWithTag(writer, 4, Long.valueOf(value.getTag()));
        }
        writer.writeBytes(value.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        FD value = (FD) obj;
        j.g(value, "value");
        int size = value.unknownFields().size();
        if (value.getFd() != 0) {
            size += ProtoAdapter.INT32.encodedSizeWithTag(1, Integer.valueOf(value.getFd()));
        }
        if (!j.b(value.getPath(), "")) {
            size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getPath());
        }
        if (!j.b(value.getOwner(), "")) {
            size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getOwner());
        }
        return value.getTag() != 0 ? ProtoAdapter.UINT64.encodedSizeWithTag(4, Long.valueOf(value.getTag())) + size : size;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        FD value = (FD) obj;
        j.g(value, "value");
        return FD.copy$default(value, 0, null, null, 0L, ByteString.EMPTY, 15, null);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter writer, Object obj) throws IOException {
        FD value = (FD) obj;
        j.g(writer, "writer");
        j.g(value, "value");
        writer.writeBytes(value.unknownFields());
        if (value.getTag() != 0) {
            ProtoAdapter.UINT64.encodeWithTag(writer, 4, Long.valueOf(value.getTag()));
        }
        if (!j.b(value.getOwner(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 3, value.getOwner());
        }
        if (!j.b(value.getPath(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 2, value.getPath());
        }
        if (value.getFd() != 0) {
            ProtoAdapter.INT32.encodeWithTag(writer, 1, Integer.valueOf(value.getFd()));
        }
    }
}
