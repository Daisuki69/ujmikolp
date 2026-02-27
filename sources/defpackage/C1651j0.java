package defpackage;

import androidx.core.app.FrameMetricsAggregator;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.io.IOException;
import kotlin.jvm.internal.j;
import okio.ByteString;

/* JADX INFO: renamed from: j0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C1651j0 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader reader) throws IOException {
        j.g(reader, "reader");
        long jBeginMessage = reader.beginMessage();
        String strDecode = "";
        long jLongValue = 0;
        long jLongValue2 = 0;
        long jLongValue3 = 0;
        long jLongValue4 = 0;
        boolean zBooleanValue = false;
        boolean zBooleanValue2 = false;
        boolean zBooleanValue3 = false;
        String strDecode2 = "";
        while (true) {
            int iNextTag = reader.nextTag();
            if (iNextTag == -1) {
                return new MemoryMapping(jLongValue, jLongValue2, jLongValue3, zBooleanValue, zBooleanValue2, zBooleanValue3, strDecode, strDecode2, jLongValue4, reader.endMessageAndGetUnknownFields(jBeginMessage));
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
                    zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                    break;
                case 5:
                    zBooleanValue2 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                    break;
                case 6:
                    zBooleanValue3 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                    break;
                case 7:
                    strDecode = ProtoAdapter.STRING.decode(reader);
                    break;
                case 8:
                    strDecode2 = ProtoAdapter.STRING.decode(reader);
                    break;
                case 9:
                    jLongValue4 = ProtoAdapter.UINT64.decode(reader).longValue();
                    break;
                default:
                    reader.readUnknownField(iNextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter writer, Object obj) throws IOException {
        MemoryMapping value = (MemoryMapping) obj;
        j.g(writer, "writer");
        j.g(value, "value");
        if (value.getBegin_address() != 0) {
            ProtoAdapter.UINT64.encodeWithTag(writer, 1, Long.valueOf(value.getBegin_address()));
        }
        if (value.getEnd_address() != 0) {
            ProtoAdapter.UINT64.encodeWithTag(writer, 2, Long.valueOf(value.getEnd_address()));
        }
        if (value.getOffset() != 0) {
            ProtoAdapter.UINT64.encodeWithTag(writer, 3, Long.valueOf(value.getOffset()));
        }
        if (value.getRead()) {
            ProtoAdapter.BOOL.encodeWithTag(writer, 4, Boolean.valueOf(value.getRead()));
        }
        if (value.getWrite()) {
            ProtoAdapter.BOOL.encodeWithTag(writer, 5, Boolean.valueOf(value.getWrite()));
        }
        if (value.getExecute()) {
            ProtoAdapter.BOOL.encodeWithTag(writer, 6, Boolean.valueOf(value.getExecute()));
        }
        if (!j.b(value.getMapping_name(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 7, value.getMapping_name());
        }
        if (!j.b(value.getBuild_id(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 8, value.getBuild_id());
        }
        if (value.getLoad_bias() != 0) {
            ProtoAdapter.UINT64.encodeWithTag(writer, 9, Long.valueOf(value.getLoad_bias()));
        }
        writer.writeBytes(value.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        MemoryMapping value = (MemoryMapping) obj;
        j.g(value, "value");
        int size = value.unknownFields().size();
        if (value.getBegin_address() != 0) {
            size += ProtoAdapter.UINT64.encodedSizeWithTag(1, Long.valueOf(value.getBegin_address()));
        }
        if (value.getEnd_address() != 0) {
            size += ProtoAdapter.UINT64.encodedSizeWithTag(2, Long.valueOf(value.getEnd_address()));
        }
        if (value.getOffset() != 0) {
            size += ProtoAdapter.UINT64.encodedSizeWithTag(3, Long.valueOf(value.getOffset()));
        }
        if (value.getRead()) {
            size += ProtoAdapter.BOOL.encodedSizeWithTag(4, Boolean.valueOf(value.getRead()));
        }
        if (value.getWrite()) {
            size += ProtoAdapter.BOOL.encodedSizeWithTag(5, Boolean.valueOf(value.getWrite()));
        }
        if (value.getExecute()) {
            size += ProtoAdapter.BOOL.encodedSizeWithTag(6, Boolean.valueOf(value.getExecute()));
        }
        if (!j.b(value.getMapping_name(), "")) {
            size += ProtoAdapter.STRING.encodedSizeWithTag(7, value.getMapping_name());
        }
        if (!j.b(value.getBuild_id(), "")) {
            size += ProtoAdapter.STRING.encodedSizeWithTag(8, value.getBuild_id());
        }
        return value.getLoad_bias() != 0 ? ProtoAdapter.UINT64.encodedSizeWithTag(9, Long.valueOf(value.getLoad_bias())) + size : size;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        MemoryMapping value = (MemoryMapping) obj;
        j.g(value, "value");
        return value.copy((FrameMetricsAggregator.EVERY_DURATION & 1) != 0 ? value.begin_address : 0L, (FrameMetricsAggregator.EVERY_DURATION & 2) != 0 ? value.end_address : 0L, (FrameMetricsAggregator.EVERY_DURATION & 4) != 0 ? value.offset : 0L, (FrameMetricsAggregator.EVERY_DURATION & 8) != 0 ? value.read : false, (FrameMetricsAggregator.EVERY_DURATION & 16) != 0 ? value.write : false, (FrameMetricsAggregator.EVERY_DURATION & 32) != 0 ? value.execute : false, (FrameMetricsAggregator.EVERY_DURATION & 64) != 0 ? value.mapping_name : null, (FrameMetricsAggregator.EVERY_DURATION & 128) != 0 ? value.build_id : null, (FrameMetricsAggregator.EVERY_DURATION & 256) != 0 ? value.load_bias : 0L, (FrameMetricsAggregator.EVERY_DURATION & 512) != 0 ? value.unknownFields() : ByteString.EMPTY);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter writer, Object obj) throws IOException {
        MemoryMapping value = (MemoryMapping) obj;
        j.g(writer, "writer");
        j.g(value, "value");
        writer.writeBytes(value.unknownFields());
        if (value.getLoad_bias() != 0) {
            ProtoAdapter.UINT64.encodeWithTag(writer, 9, Long.valueOf(value.getLoad_bias()));
        }
        if (!j.b(value.getBuild_id(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 8, value.getBuild_id());
        }
        if (!j.b(value.getMapping_name(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 7, value.getMapping_name());
        }
        if (value.getExecute()) {
            ProtoAdapter.BOOL.encodeWithTag(writer, 6, Boolean.valueOf(value.getExecute()));
        }
        if (value.getWrite()) {
            ProtoAdapter.BOOL.encodeWithTag(writer, 5, Boolean.valueOf(value.getWrite()));
        }
        if (value.getRead()) {
            ProtoAdapter.BOOL.encodeWithTag(writer, 4, Boolean.valueOf(value.getRead()));
        }
        if (value.getOffset() != 0) {
            ProtoAdapter.UINT64.encodeWithTag(writer, 3, Long.valueOf(value.getOffset()));
        }
        if (value.getEnd_address() != 0) {
            ProtoAdapter.UINT64.encodeWithTag(writer, 2, Long.valueOf(value.getEnd_address()));
        }
        if (value.getBegin_address() != 0) {
            ProtoAdapter.UINT64.encodeWithTag(writer, 1, Long.valueOf(value.getBegin_address()));
        }
    }
}
