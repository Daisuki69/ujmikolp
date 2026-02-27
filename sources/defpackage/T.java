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
public final class T extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) throws IOException {
        ArrayList arrayListJ = AbstractC1414e.j(protoReader, "reader");
        long jBeginMessage = protoReader.beginMessage();
        String strDecode = "";
        while (true) {
            int iNextTag = protoReader.nextTag();
            if (iNextTag == -1) {
                return new LogBuffer(strDecode, arrayListJ, protoReader.endMessageAndGetUnknownFields(jBeginMessage));
            }
            if (iNextTag == 1) {
                strDecode = ProtoAdapter.STRING.decode(protoReader);
            } else if (iNextTag != 2) {
                protoReader.readUnknownField(iNextTag);
            } else {
                arrayListJ.add(LogMessage.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter writer, Object obj) throws IOException {
        LogBuffer value = (LogBuffer) obj;
        j.g(writer, "writer");
        j.g(value, "value");
        if (!j.b(value.getName(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 1, value.getName());
        }
        LogMessage.ADAPTER.asRepeated().encodeWithTag(writer, 2, value.getLogs());
        writer.writeBytes(value.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LogBuffer value = (LogBuffer) obj;
        j.g(value, "value");
        int size = value.unknownFields().size();
        if (!j.b(value.getName(), "")) {
            size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getName());
        }
        return LogMessage.ADAPTER.asRepeated().encodedSizeWithTag(2, value.getLogs()) + size;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LogBuffer value = (LogBuffer) obj;
        j.g(value, "value");
        return LogBuffer.copy$default(value, null, Internal.m186redactElements(value.getLogs(), LogMessage.ADAPTER), ByteString.EMPTY, 1, null);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter writer, Object obj) throws IOException {
        LogBuffer value = (LogBuffer) obj;
        j.g(writer, "writer");
        j.g(value, "value");
        writer.writeBytes(value.unknownFields());
        LogMessage.ADAPTER.asRepeated().encodeWithTag(writer, 2, value.getLogs());
        if (j.b(value.getName(), "")) {
            return;
        }
        ProtoAdapter.STRING.encodeWithTag(writer, 1, value.getName());
    }
}
