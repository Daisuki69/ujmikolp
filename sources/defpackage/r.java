package defpackage;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.io.IOException;
import kotlin.jvm.internal.j;
import okio.ByteString;

/* JADX INFO: loaded from: classes3.dex */
public final class r extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader reader) throws IOException {
        j.g(reader, "reader");
        long jBeginMessage = reader.beginMessage();
        String strDecode = "";
        MemoryError memoryErrorDecode = null;
        while (true) {
            int iNextTag = reader.nextTag();
            if (iNextTag == -1) {
                return new Cause(strDecode, memoryErrorDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
            }
            if (iNextTag == 1) {
                strDecode = ProtoAdapter.STRING.decode(reader);
            } else if (iNextTag != 2) {
                reader.readUnknownField(iNextTag);
            } else {
                memoryErrorDecode = MemoryError.ADAPTER.decode(reader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter writer, Object obj) throws IOException {
        Cause value = (Cause) obj;
        j.g(writer, "writer");
        j.g(value, "value");
        if (!j.b(value.getHuman_readable(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 1, value.getHuman_readable());
        }
        MemoryError.ADAPTER.encodeWithTag(writer, 2, value.getMemory_error());
        writer.writeBytes(value.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Cause value = (Cause) obj;
        j.g(value, "value");
        int size = value.unknownFields().size();
        if (!j.b(value.getHuman_readable(), "")) {
            size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getHuman_readable());
        }
        return MemoryError.ADAPTER.encodedSizeWithTag(2, value.getMemory_error()) + size;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Cause value = (Cause) obj;
        j.g(value, "value");
        MemoryError memory_error = value.getMemory_error();
        return Cause.copy$default(value, null, memory_error != null ? MemoryError.ADAPTER.redact(memory_error) : null, ByteString.EMPTY, 1, null);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter writer, Object obj) throws IOException {
        Cause value = (Cause) obj;
        j.g(writer, "writer");
        j.g(value, "value");
        writer.writeBytes(value.unknownFields());
        MemoryError.ADAPTER.encodeWithTag(writer, 2, value.getMemory_error());
        if (j.b(value.getHuman_readable(), "")) {
            return;
        }
        ProtoAdapter.STRING.encodeWithTag(writer, 1, value.getHuman_readable());
    }
}
