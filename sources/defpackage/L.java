package defpackage;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.j;
import okio.ByteString;

/* JADX INFO: loaded from: classes5.dex */
public final class L extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) throws IOException {
        ArrayList arrayListJ = AbstractC1414e.j(protoReader, "reader");
        ArrayList arrayList = new ArrayList();
        long jBeginMessage = protoReader.beginMessage();
        long jLongValue = 0;
        long jLongValue2 = 0;
        long jLongValue3 = 0;
        long jLongValue4 = 0;
        while (true) {
            int iNextTag = protoReader.nextTag();
            if (iNextTag == -1) {
                return new HeapObject(jLongValue, jLongValue2, jLongValue3, arrayListJ, jLongValue4, arrayList, protoReader.endMessageAndGetUnknownFields(jBeginMessage));
            }
            switch (iNextTag) {
                case 1:
                    jLongValue = ProtoAdapter.UINT64.decode(protoReader).longValue();
                    break;
                case 2:
                    jLongValue2 = ProtoAdapter.UINT64.decode(protoReader).longValue();
                    break;
                case 3:
                    jLongValue3 = ProtoAdapter.UINT64.decode(protoReader).longValue();
                    break;
                case 4:
                    arrayListJ.add(BacktraceFrame.ADAPTER.decode(protoReader));
                    break;
                case 5:
                    jLongValue4 = ProtoAdapter.UINT64.decode(protoReader).longValue();
                    break;
                case 6:
                    arrayList.add(BacktraceFrame.ADAPTER.decode(protoReader));
                    break;
                default:
                    protoReader.readUnknownField(iNextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter writer, Object obj) throws IOException {
        HeapObject value = (HeapObject) obj;
        j.g(writer, "writer");
        j.g(value, "value");
        if (value.getAddress() != 0) {
            ProtoAdapter.UINT64.encodeWithTag(writer, 1, Long.valueOf(value.getAddress()));
        }
        if (value.getSize() != 0) {
            ProtoAdapter.UINT64.encodeWithTag(writer, 2, Long.valueOf(value.getSize()));
        }
        if (value.getAllocation_tid() != 0) {
            ProtoAdapter.UINT64.encodeWithTag(writer, 3, Long.valueOf(value.getAllocation_tid()));
        }
        ProtoAdapter<BacktraceFrame> protoAdapter = BacktraceFrame.ADAPTER;
        protoAdapter.asRepeated().encodeWithTag(writer, 4, value.getAllocation_backtrace());
        if (value.getDeallocation_tid() != 0) {
            ProtoAdapter.UINT64.encodeWithTag(writer, 5, Long.valueOf(value.getDeallocation_tid()));
        }
        protoAdapter.asRepeated().encodeWithTag(writer, 6, value.getDeallocation_backtrace());
        writer.writeBytes(value.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        HeapObject value = (HeapObject) obj;
        j.g(value, "value");
        int size = value.unknownFields().size();
        if (value.getAddress() != 0) {
            size += ProtoAdapter.UINT64.encodedSizeWithTag(1, Long.valueOf(value.getAddress()));
        }
        if (value.getSize() != 0) {
            size += ProtoAdapter.UINT64.encodedSizeWithTag(2, Long.valueOf(value.getSize()));
        }
        if (value.getAllocation_tid() != 0) {
            size += ProtoAdapter.UINT64.encodedSizeWithTag(3, Long.valueOf(value.getAllocation_tid()));
        }
        ProtoAdapter<BacktraceFrame> protoAdapter = BacktraceFrame.ADAPTER;
        int iEncodedSizeWithTag = protoAdapter.asRepeated().encodedSizeWithTag(4, value.getAllocation_backtrace()) + size;
        if (value.getDeallocation_tid() != 0) {
            iEncodedSizeWithTag += ProtoAdapter.UINT64.encodedSizeWithTag(5, Long.valueOf(value.getDeallocation_tid()));
        }
        return protoAdapter.asRepeated().encodedSizeWithTag(6, value.getDeallocation_backtrace()) + iEncodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        HeapObject value = (HeapObject) obj;
        j.g(value, "value");
        List<BacktraceFrame> allocation_backtrace = value.getAllocation_backtrace();
        ProtoAdapter<BacktraceFrame> protoAdapter = BacktraceFrame.ADAPTER;
        return HeapObject.copy$default(value, 0L, 0L, 0L, Internal.m186redactElements(allocation_backtrace, protoAdapter), 0L, Internal.m186redactElements(value.getDeallocation_backtrace(), protoAdapter), ByteString.EMPTY, 23, null);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter writer, Object obj) throws IOException {
        HeapObject value = (HeapObject) obj;
        j.g(writer, "writer");
        j.g(value, "value");
        writer.writeBytes(value.unknownFields());
        ProtoAdapter<BacktraceFrame> protoAdapter = BacktraceFrame.ADAPTER;
        protoAdapter.asRepeated().encodeWithTag(writer, 6, value.getDeallocation_backtrace());
        if (value.getDeallocation_tid() != 0) {
            ProtoAdapter.UINT64.encodeWithTag(writer, 5, Long.valueOf(value.getDeallocation_tid()));
        }
        protoAdapter.asRepeated().encodeWithTag(writer, 4, value.getAllocation_backtrace());
        if (value.getAllocation_tid() != 0) {
            ProtoAdapter.UINT64.encodeWithTag(writer, 3, Long.valueOf(value.getAllocation_tid()));
        }
        if (value.getSize() != 0) {
            ProtoAdapter.UINT64.encodeWithTag(writer, 2, Long.valueOf(value.getSize()));
        }
        if (value.getAddress() != 0) {
            ProtoAdapter.UINT64.encodeWithTag(writer, 1, Long.valueOf(value.getAddress()));
        }
    }
}
