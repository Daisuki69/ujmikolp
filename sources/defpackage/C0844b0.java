package defpackage;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.io.IOException;
import kotlin.jvm.internal.j;
import okio.ByteString;

/* JADX INFO: renamed from: b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C0844b0 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader reader) throws IOException {
        j.g(reader, "reader");
        ByteString byteStringDecode = ByteString.EMPTY;
        long jBeginMessage = reader.beginMessage();
        String strDecode = "";
        ArmMTEMetadata armMTEMetadataDecode = null;
        long jLongValue = 0;
        String strDecode2 = "";
        while (true) {
            int iNextTag = reader.nextTag();
            if (iNextTag == -1) {
                return new MemoryDump(strDecode, strDecode2, jLongValue, byteStringDecode, armMTEMetadataDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
            }
            if (iNextTag == 1) {
                strDecode = ProtoAdapter.STRING.decode(reader);
            } else if (iNextTag == 2) {
                strDecode2 = ProtoAdapter.STRING.decode(reader);
            } else if (iNextTag == 3) {
                jLongValue = ProtoAdapter.UINT64.decode(reader).longValue();
            } else if (iNextTag == 4) {
                byteStringDecode = ProtoAdapter.BYTES.decode(reader);
            } else if (iNextTag != 6) {
                reader.readUnknownField(iNextTag);
            } else {
                armMTEMetadataDecode = ArmMTEMetadata.ADAPTER.decode(reader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter writer, Object obj) throws IOException {
        MemoryDump value = (MemoryDump) obj;
        j.g(writer, "writer");
        j.g(value, "value");
        if (!j.b(value.getRegister_name(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 1, value.getRegister_name());
        }
        if (!j.b(value.getMapping_name(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 2, value.getMapping_name());
        }
        if (value.getBegin_address() != 0) {
            ProtoAdapter.UINT64.encodeWithTag(writer, 3, Long.valueOf(value.getBegin_address()));
        }
        if (!j.b(value.getMemory(), ByteString.EMPTY)) {
            ProtoAdapter.BYTES.encodeWithTag(writer, 4, value.getMemory());
        }
        ArmMTEMetadata.ADAPTER.encodeWithTag(writer, 6, value.getArm_mte_metadata());
        writer.writeBytes(value.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        MemoryDump value = (MemoryDump) obj;
        j.g(value, "value");
        int size = value.unknownFields().size();
        if (!j.b(value.getRegister_name(), "")) {
            size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getRegister_name());
        }
        if (!j.b(value.getMapping_name(), "")) {
            size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getMapping_name());
        }
        if (value.getBegin_address() != 0) {
            size += ProtoAdapter.UINT64.encodedSizeWithTag(3, Long.valueOf(value.getBegin_address()));
        }
        if (!j.b(value.getMemory(), ByteString.EMPTY)) {
            size += ProtoAdapter.BYTES.encodedSizeWithTag(4, value.getMemory());
        }
        return ArmMTEMetadata.ADAPTER.encodedSizeWithTag(6, value.getArm_mte_metadata()) + size;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        MemoryDump value = (MemoryDump) obj;
        j.g(value, "value");
        ArmMTEMetadata arm_mte_metadata = value.getArm_mte_metadata();
        return MemoryDump.copy$default(value, null, null, 0L, null, arm_mte_metadata != null ? ArmMTEMetadata.ADAPTER.redact(arm_mte_metadata) : null, ByteString.EMPTY, 15, null);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter writer, Object obj) throws IOException {
        MemoryDump value = (MemoryDump) obj;
        j.g(writer, "writer");
        j.g(value, "value");
        writer.writeBytes(value.unknownFields());
        ArmMTEMetadata.ADAPTER.encodeWithTag(writer, 6, value.getArm_mte_metadata());
        if (!j.b(value.getMemory(), ByteString.EMPTY)) {
            ProtoAdapter.BYTES.encodeWithTag(writer, 4, value.getMemory());
        }
        if (value.getBegin_address() != 0) {
            ProtoAdapter.UINT64.encodeWithTag(writer, 3, Long.valueOf(value.getBegin_address()));
        }
        if (!j.b(value.getMapping_name(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 2, value.getMapping_name());
        }
        if (j.b(value.getRegister_name(), "")) {
            return;
        }
        ProtoAdapter.STRING.encodeWithTag(writer, 1, value.getRegister_name());
    }
}
