package dg;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import dOYHB6.tiZVw8.numX49;
import dde.protobuf.fragments.Reminder;
import java.io.IOException;
import okio.ByteString;

/* JADX INFO: loaded from: classes4.dex */
public final class Q extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) throws IOException {
        kotlin.jvm.internal.j.g(protoReader, numX49.tnTj78("bd5b2"));
        long jBeginMessage = protoReader.beginMessage();
        Boolean boolDecode = null;
        String strDecode = null;
        String strDecode2 = null;
        while (true) {
            int iNextTag = protoReader.nextTag();
            if (iNextTag == -1) {
                return new Reminder(boolDecode, strDecode, strDecode2, protoReader.endMessageAndGetUnknownFields(jBeginMessage));
            }
            if (iNextTag == 1) {
                boolDecode = ProtoAdapter.BOOL.decode(protoReader);
            } else if (iNextTag == 2) {
                strDecode = ProtoAdapter.STRING.decode(protoReader);
            } else if (iNextTag != 3) {
                protoReader.readUnknownField(iNextTag);
            } else {
                strDecode2 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) throws IOException {
        Reminder reminder = (Reminder) obj;
        kotlin.jvm.internal.j.g(protoWriter, numX49.tnTj78("bd5bL"));
        kotlin.jvm.internal.j.g(reminder, numX49.tnTj78("bd5br"));
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, reminder.getHasName());
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 2, reminder.getStart());
        protoAdapter.encodeWithTag(protoWriter, 3, reminder.getEnd());
        protoWriter.writeBytes(reminder.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Reminder reminder = (Reminder) obj;
        kotlin.jvm.internal.j.g(reminder, numX49.tnTj78("bd5bB"));
        int iEncodedSizeWithTag = ProtoAdapter.BOOL.encodedSizeWithTag(1, reminder.getHasName()) + reminder.unknownFields().size();
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(3, reminder.getEnd()) + protoAdapter.encodedSizeWithTag(2, reminder.getStart()) + iEncodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Reminder reminder = (Reminder) obj;
        kotlin.jvm.internal.j.g(reminder, numX49.tnTj78("bd5bu"));
        return Reminder.copy$default(reminder, null, null, null, ByteString.EMPTY, 7, null);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) throws IOException {
        Reminder reminder = (Reminder) obj;
        kotlin.jvm.internal.j.g(reverseProtoWriter, numX49.tnTj78("bd5bZ"));
        kotlin.jvm.internal.j.g(reminder, numX49.tnTj78("bd5bk"));
        reverseProtoWriter.writeBytes(reminder.unknownFields());
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, reminder.getEnd());
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, reminder.getStart());
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 1, reminder.getHasName());
    }
}
