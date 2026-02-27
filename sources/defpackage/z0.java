package defpackage;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.jvm.internal.j;
import okio.ByteString;

/* JADX INFO: loaded from: classes5.dex */
public final class z0 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) throws IOException {
        ArrayList arrayListJ = AbstractC1414e.j(protoReader, "reader");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        long jBeginMessage = protoReader.beginMessage();
        int iIntValue = 0;
        String strDecode = "";
        long jLongValue = 0;
        long jLongValue2 = 0;
        while (true) {
            int iNextTag = protoReader.nextTag();
            if (iNextTag == -1) {
                return new Thread(iIntValue, strDecode, arrayListJ, arrayList, arrayList2, arrayList3, arrayList4, jLongValue, jLongValue2, protoReader.endMessageAndGetUnknownFields(jBeginMessage));
            }
            switch (iNextTag) {
                case 1:
                    iIntValue = ProtoAdapter.INT32.decode(protoReader).intValue();
                    break;
                case 2:
                    strDecode = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 3:
                    arrayListJ.add(Register.ADAPTER.decode(protoReader));
                    break;
                case 4:
                    arrayList3.add(BacktraceFrame.ADAPTER.decode(protoReader));
                    break;
                case 5:
                    arrayList4.add(MemoryDump.ADAPTER.decode(protoReader));
                    break;
                case 6:
                    jLongValue = ProtoAdapter.INT64.decode(protoReader).longValue();
                    break;
                case 7:
                    arrayList.add(ProtoAdapter.STRING.decode(protoReader));
                    break;
                case 8:
                    jLongValue2 = ProtoAdapter.INT64.decode(protoReader).longValue();
                    break;
                case 9:
                    arrayList2.add(ProtoAdapter.STRING.decode(protoReader));
                    break;
                default:
                    protoReader.readUnknownField(iNextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter writer, Object obj) throws IOException {
        Thread value = (Thread) obj;
        j.g(writer, "writer");
        j.g(value, "value");
        if (value.getId() != 0) {
            ProtoAdapter.INT32.encodeWithTag(writer, 1, Integer.valueOf(value.getId()));
        }
        if (!j.b(value.getName(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 2, value.getName());
        }
        Register.ADAPTER.asRepeated().encodeWithTag(writer, 3, value.getRegisters());
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.asRepeated().encodeWithTag(writer, 7, value.getBacktrace_note());
        protoAdapter.asRepeated().encodeWithTag(writer, 9, value.getUnreadable_elf_files());
        BacktraceFrame.ADAPTER.asRepeated().encodeWithTag(writer, 4, value.getCurrent_backtrace());
        MemoryDump.ADAPTER.asRepeated().encodeWithTag(writer, 5, value.getMemory_dump());
        if (value.getTagged_addr_ctrl() != 0) {
            ProtoAdapter.INT64.encodeWithTag(writer, 6, Long.valueOf(value.getTagged_addr_ctrl()));
        }
        if (value.getPac_enabled_keys() != 0) {
            ProtoAdapter.INT64.encodeWithTag(writer, 8, Long.valueOf(value.getPac_enabled_keys()));
        }
        writer.writeBytes(value.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Thread value = (Thread) obj;
        j.g(value, "value");
        int size = value.unknownFields().size();
        if (value.getId() != 0) {
            size += ProtoAdapter.INT32.encodedSizeWithTag(1, Integer.valueOf(value.getId()));
        }
        if (!j.b(value.getName(), "")) {
            size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getName());
        }
        int iEncodedSizeWithTag = Register.ADAPTER.asRepeated().encodedSizeWithTag(3, value.getRegisters()) + size;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        int iEncodedSizeWithTag2 = MemoryDump.ADAPTER.asRepeated().encodedSizeWithTag(5, value.getMemory_dump()) + BacktraceFrame.ADAPTER.asRepeated().encodedSizeWithTag(4, value.getCurrent_backtrace()) + protoAdapter.asRepeated().encodedSizeWithTag(9, value.getUnreadable_elf_files()) + protoAdapter.asRepeated().encodedSizeWithTag(7, value.getBacktrace_note()) + iEncodedSizeWithTag;
        if (value.getTagged_addr_ctrl() != 0) {
            iEncodedSizeWithTag2 += ProtoAdapter.INT64.encodedSizeWithTag(6, Long.valueOf(value.getTagged_addr_ctrl()));
        }
        return value.getPac_enabled_keys() != 0 ? ProtoAdapter.INT64.encodedSizeWithTag(8, Long.valueOf(value.getPac_enabled_keys())) + iEncodedSizeWithTag2 : iEncodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Thread value = (Thread) obj;
        j.g(value, "value");
        return Thread.copy$default(value, 0, null, Internal.m186redactElements(value.getRegisters(), Register.ADAPTER), null, null, Internal.m186redactElements(value.getCurrent_backtrace(), BacktraceFrame.ADAPTER), Internal.m186redactElements(value.getMemory_dump(), MemoryDump.ADAPTER), 0L, 0L, ByteString.EMPTY, 411, null);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter writer, Object obj) throws IOException {
        Thread value = (Thread) obj;
        j.g(writer, "writer");
        j.g(value, "value");
        writer.writeBytes(value.unknownFields());
        if (value.getPac_enabled_keys() != 0) {
            ProtoAdapter.INT64.encodeWithTag(writer, 8, Long.valueOf(value.getPac_enabled_keys()));
        }
        if (value.getTagged_addr_ctrl() != 0) {
            ProtoAdapter.INT64.encodeWithTag(writer, 6, Long.valueOf(value.getTagged_addr_ctrl()));
        }
        MemoryDump.ADAPTER.asRepeated().encodeWithTag(writer, 5, value.getMemory_dump());
        BacktraceFrame.ADAPTER.asRepeated().encodeWithTag(writer, 4, value.getCurrent_backtrace());
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.asRepeated().encodeWithTag(writer, 9, value.getUnreadable_elf_files());
        protoAdapter.asRepeated().encodeWithTag(writer, 7, value.getBacktrace_note());
        Register.ADAPTER.asRepeated().encodeWithTag(writer, 3, value.getRegisters());
        if (!j.b(value.getName(), "")) {
            protoAdapter.encodeWithTag(writer, 2, value.getName());
        }
        if (value.getId() != 0) {
            ProtoAdapter.INT32.encodeWithTag(writer, 1, Integer.valueOf(value.getId()));
        }
    }
}
