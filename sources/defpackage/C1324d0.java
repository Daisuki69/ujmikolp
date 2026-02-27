package defpackage;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.io.IOException;
import kotlin.jvm.internal.j;
import okio.ByteString;

/* JADX INFO: renamed from: d0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C1324d0 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader reader) throws IOException {
        j.g(reader, "reader");
        Object objDecode = EnumC1491g0.f16767d;
        Object objDecode2 = EnumC1580i0.f17062d;
        long jBeginMessage = reader.beginMessage();
        HeapObject heapObjectDecode = null;
        while (true) {
            int iNextTag = reader.nextTag();
            if (iNextTag == -1) {
                return new MemoryError((EnumC1491g0) objDecode, (EnumC1580i0) objDecode2, heapObjectDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
            }
            if (iNextTag == 1) {
                try {
                    objDecode = EnumC1491g0.c.decode(reader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (iNextTag == 2) {
                try {
                    objDecode2 = EnumC1580i0.c.decode(reader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e7) {
                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e7.value));
                }
            } else if (iNextTag != 3) {
                reader.readUnknownField(iNextTag);
            } else {
                heapObjectDecode = HeapObject.ADAPTER.decode(reader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter writer, Object obj) throws IOException {
        MemoryError value = (MemoryError) obj;
        j.g(writer, "writer");
        j.g(value, "value");
        if (value.getTool() != EnumC1491g0.f16767d) {
            EnumC1491g0.c.encodeWithTag(writer, 1, value.getTool());
        }
        if (value.getType() != EnumC1580i0.f17062d) {
            EnumC1580i0.c.encodeWithTag(writer, 2, value.getType());
        }
        HeapObject.ADAPTER.encodeWithTag(writer, 3, value.getHeap());
        writer.writeBytes(value.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        MemoryError value = (MemoryError) obj;
        j.g(value, "value");
        int size = value.unknownFields().size();
        if (value.getTool() != EnumC1491g0.f16767d) {
            size += EnumC1491g0.c.encodedSizeWithTag(1, value.getTool());
        }
        if (value.getType() != EnumC1580i0.f17062d) {
            size += EnumC1580i0.c.encodedSizeWithTag(2, value.getType());
        }
        return HeapObject.ADAPTER.encodedSizeWithTag(3, value.getHeap()) + size;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        MemoryError value = (MemoryError) obj;
        j.g(value, "value");
        HeapObject heap = value.getHeap();
        return MemoryError.copy$default(value, null, null, heap != null ? HeapObject.ADAPTER.redact(heap) : null, ByteString.EMPTY, 3, null);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter writer, Object obj) throws IOException {
        MemoryError value = (MemoryError) obj;
        j.g(writer, "writer");
        j.g(value, "value");
        writer.writeBytes(value.unknownFields());
        HeapObject.ADAPTER.encodeWithTag(writer, 3, value.getHeap());
        if (value.getType() != EnumC1580i0.f17062d) {
            EnumC1580i0.c.encodeWithTag(writer, 2, value.getType());
        }
        if (value.getTool() != EnumC1491g0.f16767d) {
            EnumC1491g0.c.encodeWithTag(writer, 1, value.getTool());
        }
    }
}
