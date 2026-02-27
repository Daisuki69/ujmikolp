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
public final class v0 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) throws IOException {
        ArrayList arrayListJ = AbstractC1414e.j(protoReader, "reader");
        long jBeginMessage = protoReader.beginMessage();
        long jLongValue = 0;
        while (true) {
            int iNextTag = protoReader.nextTag();
            if (iNextTag == -1) {
                return new StackHistoryBuffer(jLongValue, arrayListJ, protoReader.endMessageAndGetUnknownFields(jBeginMessage));
            }
            if (iNextTag == 1) {
                jLongValue = ProtoAdapter.UINT64.decode(protoReader).longValue();
            } else if (iNextTag != 2) {
                protoReader.readUnknownField(iNextTag);
            } else {
                arrayListJ.add(StackHistoryBufferEntry.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter writer, Object obj) throws IOException {
        StackHistoryBuffer value = (StackHistoryBuffer) obj;
        j.g(writer, "writer");
        j.g(value, "value");
        if (value.getTid() != 0) {
            ProtoAdapter.UINT64.encodeWithTag(writer, 1, Long.valueOf(value.getTid()));
        }
        StackHistoryBufferEntry.ADAPTER.asRepeated().encodeWithTag(writer, 2, value.getEntries());
        writer.writeBytes(value.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        StackHistoryBuffer value = (StackHistoryBuffer) obj;
        j.g(value, "value");
        int size = value.unknownFields().size();
        if (value.getTid() != 0) {
            size += ProtoAdapter.UINT64.encodedSizeWithTag(1, Long.valueOf(value.getTid()));
        }
        return StackHistoryBufferEntry.ADAPTER.asRepeated().encodedSizeWithTag(2, value.getEntries()) + size;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        StackHistoryBuffer value = (StackHistoryBuffer) obj;
        j.g(value, "value");
        return StackHistoryBuffer.copy$default(value, 0L, Internal.m186redactElements(value.getEntries(), StackHistoryBufferEntry.ADAPTER), ByteString.EMPTY, 1, null);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter writer, Object obj) throws IOException {
        StackHistoryBuffer value = (StackHistoryBuffer) obj;
        j.g(writer, "writer");
        j.g(value, "value");
        writer.writeBytes(value.unknownFields());
        StackHistoryBufferEntry.ADAPTER.asRepeated().encodeWithTag(writer, 2, value.getEntries());
        if (value.getTid() != 0) {
            ProtoAdapter.UINT64.encodeWithTag(writer, 1, Long.valueOf(value.getTid()));
        }
    }
}
