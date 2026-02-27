package defpackage;

import androidx.core.app.FrameMetricsAggregator;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.io.IOException;
import kotlin.jvm.internal.j;
import okio.ByteString;

/* JADX INFO: loaded from: classes5.dex */
public final class t0 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader reader) throws IOException {
        j.g(reader, "reader");
        long jBeginMessage = reader.beginMessage();
        String strDecode = "";
        long jLongValue = 0;
        MemoryDump memoryDumpDecode = null;
        int iIntValue = 0;
        int iIntValue2 = 0;
        boolean zBooleanValue = false;
        int iIntValue3 = 0;
        int iIntValue4 = 0;
        boolean zBooleanValue2 = false;
        String strDecode2 = "";
        while (true) {
            long j = jLongValue;
            while (true) {
                int iNextTag = reader.nextTag();
                if (iNextTag == -1) {
                    return new Signal(iIntValue, strDecode, iIntValue2, strDecode2, zBooleanValue, iIntValue3, iIntValue4, zBooleanValue2, j, memoryDumpDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                }
                switch (iNextTag) {
                    case 1:
                        iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                        break;
                    case 2:
                        strDecode = ProtoAdapter.STRING.decode(reader);
                        break;
                    case 3:
                        iIntValue2 = ProtoAdapter.INT32.decode(reader).intValue();
                        break;
                    case 4:
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                        break;
                    case 5:
                        zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                        break;
                    case 6:
                        iIntValue3 = ProtoAdapter.INT32.decode(reader).intValue();
                        break;
                    case 7:
                        iIntValue4 = ProtoAdapter.INT32.decode(reader).intValue();
                        break;
                    case 8:
                        zBooleanValue2 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                        break;
                    case 9:
                        break;
                    case 10:
                        memoryDumpDecode = MemoryDump.ADAPTER.decode(reader);
                        break;
                    default:
                        reader.readUnknownField(iNextTag);
                        break;
                }
            }
            jLongValue = ProtoAdapter.UINT64.decode(reader).longValue();
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter writer, Object obj) throws IOException {
        Signal value = (Signal) obj;
        j.g(writer, "writer");
        j.g(value, "value");
        if (value.getNumber() != 0) {
            ProtoAdapter.INT32.encodeWithTag(writer, 1, Integer.valueOf(value.getNumber()));
        }
        if (!j.b(value.getName(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 2, value.getName());
        }
        if (value.getCode() != 0) {
            ProtoAdapter.INT32.encodeWithTag(writer, 3, Integer.valueOf(value.getCode()));
        }
        if (!j.b(value.getCode_name(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 4, value.getCode_name());
        }
        if (value.getHas_sender()) {
            ProtoAdapter.BOOL.encodeWithTag(writer, 5, Boolean.valueOf(value.getHas_sender()));
        }
        if (value.getSender_uid() != 0) {
            ProtoAdapter.INT32.encodeWithTag(writer, 6, Integer.valueOf(value.getSender_uid()));
        }
        if (value.getSender_pid() != 0) {
            ProtoAdapter.INT32.encodeWithTag(writer, 7, Integer.valueOf(value.getSender_pid()));
        }
        if (value.getHas_fault_address()) {
            ProtoAdapter.BOOL.encodeWithTag(writer, 8, Boolean.valueOf(value.getHas_fault_address()));
        }
        if (value.getFault_address() != 0) {
            ProtoAdapter.UINT64.encodeWithTag(writer, 9, Long.valueOf(value.getFault_address()));
        }
        if (value.getFault_adjacent_metadata() != null) {
            MemoryDump.ADAPTER.encodeWithTag(writer, 10, value.getFault_adjacent_metadata());
        }
        writer.writeBytes(value.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Signal value = (Signal) obj;
        j.g(value, "value");
        int size = value.unknownFields().size();
        if (value.getNumber() != 0) {
            size += ProtoAdapter.INT32.encodedSizeWithTag(1, Integer.valueOf(value.getNumber()));
        }
        if (!j.b(value.getName(), "")) {
            size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getName());
        }
        if (value.getCode() != 0) {
            size += ProtoAdapter.INT32.encodedSizeWithTag(3, Integer.valueOf(value.getCode()));
        }
        if (!j.b(value.getCode_name(), "")) {
            size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getCode_name());
        }
        if (value.getHas_sender()) {
            size += ProtoAdapter.BOOL.encodedSizeWithTag(5, Boolean.valueOf(value.getHas_sender()));
        }
        if (value.getSender_uid() != 0) {
            size += ProtoAdapter.INT32.encodedSizeWithTag(6, Integer.valueOf(value.getSender_uid()));
        }
        if (value.getSender_pid() != 0) {
            size += ProtoAdapter.INT32.encodedSizeWithTag(7, Integer.valueOf(value.getSender_pid()));
        }
        if (value.getHas_fault_address()) {
            size += ProtoAdapter.BOOL.encodedSizeWithTag(8, Boolean.valueOf(value.getHas_fault_address()));
        }
        if (value.getFault_address() != 0) {
            size += ProtoAdapter.UINT64.encodedSizeWithTag(9, Long.valueOf(value.getFault_address()));
        }
        return value.getFault_adjacent_metadata() != null ? MemoryDump.ADAPTER.encodedSizeWithTag(10, value.getFault_adjacent_metadata()) + size : size;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Signal value = (Signal) obj;
        j.g(value, "value");
        MemoryDump fault_adjacent_metadata = value.getFault_adjacent_metadata();
        return Signal.copy$default(value, 0, null, 0, null, false, 0, 0, false, 0L, fault_adjacent_metadata != null ? MemoryDump.ADAPTER.redact(fault_adjacent_metadata) : null, ByteString.EMPTY, FrameMetricsAggregator.EVERY_DURATION, null);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter writer, Object obj) throws IOException {
        Signal value = (Signal) obj;
        j.g(writer, "writer");
        j.g(value, "value");
        writer.writeBytes(value.unknownFields());
        if (value.getFault_adjacent_metadata() != null) {
            MemoryDump.ADAPTER.encodeWithTag(writer, 10, value.getFault_adjacent_metadata());
        }
        if (value.getFault_address() != 0) {
            ProtoAdapter.UINT64.encodeWithTag(writer, 9, Long.valueOf(value.getFault_address()));
        }
        if (value.getHas_fault_address()) {
            ProtoAdapter.BOOL.encodeWithTag(writer, 8, Boolean.valueOf(value.getHas_fault_address()));
        }
        if (value.getSender_pid() != 0) {
            ProtoAdapter.INT32.encodeWithTag(writer, 7, Integer.valueOf(value.getSender_pid()));
        }
        if (value.getSender_uid() != 0) {
            ProtoAdapter.INT32.encodeWithTag(writer, 6, Integer.valueOf(value.getSender_uid()));
        }
        if (value.getHas_sender()) {
            ProtoAdapter.BOOL.encodeWithTag(writer, 5, Boolean.valueOf(value.getHas_sender()));
        }
        if (!j.b(value.getCode_name(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 4, value.getCode_name());
        }
        if (value.getCode() != 0) {
            ProtoAdapter.INT32.encodeWithTag(writer, 3, Integer.valueOf(value.getCode()));
        }
        if (!j.b(value.getName(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 2, value.getName());
        }
        if (value.getNumber() != 0) {
            ProtoAdapter.INT32.encodeWithTag(writer, 1, Integer.valueOf(value.getNumber()));
        }
    }
}
