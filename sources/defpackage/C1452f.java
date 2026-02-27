package defpackage;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.io.IOException;
import kotlin.jvm.internal.j;
import okio.ByteString;

/* JADX INFO: renamed from: f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1452f extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader reader) throws IOException {
        j.g(reader, "reader");
        long jBeginMessage = reader.beginMessage();
        String strDecode = "";
        long jLongValue = 0;
        long jLongValue2 = 0;
        long jLongValue3 = 0;
        long jLongValue4 = 0;
        long jLongValue5 = 0;
        String strDecode2 = "";
        String strDecode3 = strDecode2;
        while (true) {
            int iNextTag = reader.nextTag();
            if (iNextTag == -1) {
                return new BacktraceFrame(jLongValue, jLongValue2, jLongValue3, strDecode, jLongValue4, strDecode2, jLongValue5, strDecode3, reader.endMessageAndGetUnknownFields(jBeginMessage));
            }
            switch (iNextTag) {
                case 1:
                    jLongValue = ProtoAdapter.UINT64.decode(reader).longValue();
                    break;
                case 2:
                    jLongValue2 = ProtoAdapter.UINT64.decode(reader).longValue();
                    break;
                case 3:
                    jLongValue3 = ProtoAdapter.UINT64.decode(reader).longValue();
                    break;
                case 4:
                    strDecode = ProtoAdapter.STRING.decode(reader);
                    break;
                case 5:
                    jLongValue4 = ProtoAdapter.UINT64.decode(reader).longValue();
                    break;
                case 6:
                    strDecode2 = ProtoAdapter.STRING.decode(reader);
                    break;
                case 7:
                    jLongValue5 = ProtoAdapter.UINT64.decode(reader).longValue();
                    break;
                case 8:
                    strDecode3 = ProtoAdapter.STRING.decode(reader);
                    break;
                default:
                    reader.readUnknownField(iNextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter writer, Object obj) throws IOException {
        BacktraceFrame value = (BacktraceFrame) obj;
        j.g(writer, "writer");
        j.g(value, "value");
        if (value.getRel_pc() != 0) {
            ProtoAdapter.UINT64.encodeWithTag(writer, 1, Long.valueOf(value.getRel_pc()));
        }
        if (value.getPc() != 0) {
            ProtoAdapter.UINT64.encodeWithTag(writer, 2, Long.valueOf(value.getPc()));
        }
        if (value.getSp() != 0) {
            ProtoAdapter.UINT64.encodeWithTag(writer, 3, Long.valueOf(value.getSp()));
        }
        if (!j.b(value.getFunction_name(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 4, value.getFunction_name());
        }
        if (value.getFunction_offset() != 0) {
            ProtoAdapter.UINT64.encodeWithTag(writer, 5, Long.valueOf(value.getFunction_offset()));
        }
        if (!j.b(value.getFile_name(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 6, value.getFile_name());
        }
        if (value.getFile_map_offset() != 0) {
            ProtoAdapter.UINT64.encodeWithTag(writer, 7, Long.valueOf(value.getFile_map_offset()));
        }
        if (!j.b(value.getBuild_id(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 8, value.getBuild_id());
        }
        writer.writeBytes(value.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        BacktraceFrame value = (BacktraceFrame) obj;
        j.g(value, "value");
        int size = value.unknownFields().size();
        if (value.getRel_pc() != 0) {
            size += ProtoAdapter.UINT64.encodedSizeWithTag(1, Long.valueOf(value.getRel_pc()));
        }
        if (value.getPc() != 0) {
            size += ProtoAdapter.UINT64.encodedSizeWithTag(2, Long.valueOf(value.getPc()));
        }
        if (value.getSp() != 0) {
            size += ProtoAdapter.UINT64.encodedSizeWithTag(3, Long.valueOf(value.getSp()));
        }
        if (!j.b(value.getFunction_name(), "")) {
            size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getFunction_name());
        }
        if (value.getFunction_offset() != 0) {
            size += ProtoAdapter.UINT64.encodedSizeWithTag(5, Long.valueOf(value.getFunction_offset()));
        }
        if (!j.b(value.getFile_name(), "")) {
            size += ProtoAdapter.STRING.encodedSizeWithTag(6, value.getFile_name());
        }
        if (value.getFile_map_offset() != 0) {
            size += ProtoAdapter.UINT64.encodedSizeWithTag(7, Long.valueOf(value.getFile_map_offset()));
        }
        return !j.b(value.getBuild_id(), "") ? ProtoAdapter.STRING.encodedSizeWithTag(8, value.getBuild_id()) + size : size;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        BacktraceFrame value = (BacktraceFrame) obj;
        j.g(value, "value");
        return value.copy((255 & 1) != 0 ? value.rel_pc : 0L, (255 & 2) != 0 ? value.f388pc : 0L, (255 & 4) != 0 ? value.sp : 0L, (255 & 8) != 0 ? value.function_name : null, (255 & 16) != 0 ? value.function_offset : 0L, (255 & 32) != 0 ? value.file_name : null, (255 & 64) != 0 ? value.file_map_offset : 0L, (255 & 128) != 0 ? value.build_id : null, (255 & 256) != 0 ? value.unknownFields() : ByteString.EMPTY);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter writer, Object obj) throws IOException {
        BacktraceFrame value = (BacktraceFrame) obj;
        j.g(writer, "writer");
        j.g(value, "value");
        writer.writeBytes(value.unknownFields());
        if (!j.b(value.getBuild_id(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 8, value.getBuild_id());
        }
        if (value.getFile_map_offset() != 0) {
            ProtoAdapter.UINT64.encodeWithTag(writer, 7, Long.valueOf(value.getFile_map_offset()));
        }
        if (!j.b(value.getFile_name(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 6, value.getFile_name());
        }
        if (value.getFunction_offset() != 0) {
            ProtoAdapter.UINT64.encodeWithTag(writer, 5, Long.valueOf(value.getFunction_offset()));
        }
        if (!j.b(value.getFunction_name(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 4, value.getFunction_name());
        }
        if (value.getSp() != 0) {
            ProtoAdapter.UINT64.encodeWithTag(writer, 3, Long.valueOf(value.getSp()));
        }
        if (value.getPc() != 0) {
            ProtoAdapter.UINT64.encodeWithTag(writer, 2, Long.valueOf(value.getPc()));
        }
        if (value.getRel_pc() != 0) {
            ProtoAdapter.UINT64.encodeWithTag(writer, 1, Long.valueOf(value.getRel_pc()));
        }
    }
}
