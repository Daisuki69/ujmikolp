package defpackage;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.io.IOException;
import kotlin.jvm.internal.j;
import okio.ByteString;

/* JADX INFO: loaded from: classes5.dex */
public final class x0 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader reader) throws IOException {
        j.g(reader, "reader");
        long jBeginMessage = reader.beginMessage();
        BacktraceFrame backtraceFrameDecode = null;
        long jLongValue = 0;
        long jLongValue2 = 0;
        while (true) {
            int iNextTag = reader.nextTag();
            if (iNextTag == -1) {
                return new StackHistoryBufferEntry(backtraceFrameDecode, jLongValue, jLongValue2, reader.endMessageAndGetUnknownFields(jBeginMessage));
            }
            if (iNextTag == 1) {
                backtraceFrameDecode = BacktraceFrame.ADAPTER.decode(reader);
            } else if (iNextTag == 2) {
                jLongValue = ProtoAdapter.UINT64.decode(reader).longValue();
            } else if (iNextTag != 3) {
                reader.readUnknownField(iNextTag);
            } else {
                jLongValue2 = ProtoAdapter.UINT64.decode(reader).longValue();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter writer, Object obj) throws IOException {
        StackHistoryBufferEntry value = (StackHistoryBufferEntry) obj;
        j.g(writer, "writer");
        j.g(value, "value");
        if (value.getAddr() != null) {
            BacktraceFrame.ADAPTER.encodeWithTag(writer, 1, value.getAddr());
        }
        if (value.getFp() != 0) {
            ProtoAdapter.UINT64.encodeWithTag(writer, 2, Long.valueOf(value.getFp()));
        }
        if (value.getTag() != 0) {
            ProtoAdapter.UINT64.encodeWithTag(writer, 3, Long.valueOf(value.getTag()));
        }
        writer.writeBytes(value.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        StackHistoryBufferEntry value = (StackHistoryBufferEntry) obj;
        j.g(value, "value");
        int size = value.unknownFields().size();
        if (value.getAddr() != null) {
            size += BacktraceFrame.ADAPTER.encodedSizeWithTag(1, value.getAddr());
        }
        if (value.getFp() != 0) {
            size += ProtoAdapter.UINT64.encodedSizeWithTag(2, Long.valueOf(value.getFp()));
        }
        return value.getTag() != 0 ? ProtoAdapter.UINT64.encodedSizeWithTag(3, Long.valueOf(value.getTag())) + size : size;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        StackHistoryBufferEntry value = (StackHistoryBufferEntry) obj;
        j.g(value, "value");
        BacktraceFrame addr = value.getAddr();
        return StackHistoryBufferEntry.copy$default(value, addr != null ? BacktraceFrame.ADAPTER.redact(addr) : null, 0L, 0L, ByteString.EMPTY, 6, null);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter writer, Object obj) throws IOException {
        StackHistoryBufferEntry value = (StackHistoryBufferEntry) obj;
        j.g(writer, "writer");
        j.g(value, "value");
        writer.writeBytes(value.unknownFields());
        if (value.getTag() != 0) {
            ProtoAdapter.UINT64.encodeWithTag(writer, 3, Long.valueOf(value.getTag()));
        }
        if (value.getFp() != 0) {
            ProtoAdapter.UINT64.encodeWithTag(writer, 2, Long.valueOf(value.getFp()));
        }
        if (value.getAddr() != null) {
            BacktraceFrame.ADAPTER.encodeWithTag(writer, 1, value.getAddr());
        }
    }
}
