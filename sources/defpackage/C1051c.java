package defpackage;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.io.IOException;
import kotlin.jvm.internal.j;
import okio.ByteString;

/* JADX INFO: renamed from: c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1051c extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader reader) throws IOException {
        j.g(reader, "reader");
        ByteString byteStringDecode = ByteString.EMPTY;
        long jBeginMessage = reader.beginMessage();
        while (true) {
            int iNextTag = reader.nextTag();
            if (iNextTag == -1) {
                return new ArmMTEMetadata(byteStringDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
            }
            if (iNextTag == 1) {
                byteStringDecode = ProtoAdapter.BYTES.decode(reader);
            } else {
                reader.readUnknownField(iNextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter writer, Object obj) throws IOException {
        ArmMTEMetadata value = (ArmMTEMetadata) obj;
        j.g(writer, "writer");
        j.g(value, "value");
        if (!j.b(value.getMemory_tags(), ByteString.EMPTY)) {
            ProtoAdapter.BYTES.encodeWithTag(writer, 1, value.getMemory_tags());
        }
        writer.writeBytes(value.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ArmMTEMetadata value = (ArmMTEMetadata) obj;
        j.g(value, "value");
        int size = value.unknownFields().size();
        return !j.b(value.getMemory_tags(), ByteString.EMPTY) ? ProtoAdapter.BYTES.encodedSizeWithTag(1, value.getMemory_tags()) + size : size;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ArmMTEMetadata value = (ArmMTEMetadata) obj;
        j.g(value, "value");
        return ArmMTEMetadata.copy$default(value, null, ByteString.EMPTY, 1, null);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter writer, Object obj) throws IOException {
        ArmMTEMetadata value = (ArmMTEMetadata) obj;
        j.g(writer, "writer");
        j.g(value, "value");
        writer.writeBytes(value.unknownFields());
        if (j.b(value.getMemory_tags(), ByteString.EMPTY)) {
            return;
        }
        ProtoAdapter.BYTES.encodeWithTag(writer, 1, value.getMemory_tags());
    }
}
