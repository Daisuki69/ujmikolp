package defpackage;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.io.IOException;
import kotlin.jvm.internal.j;
import okio.ByteString;

/* JADX INFO: renamed from: n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1869n extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader reader) throws IOException {
        j.g(reader, "reader");
        long jBeginMessage = reader.beginMessage();
        Boolean boolDecode = null;
        String strDecode = null;
        String strDecode2 = null;
        while (true) {
            int iNextTag = reader.nextTag();
            if (iNextTag == -1) {
                return new CalendarReminder(boolDecode, strDecode, strDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
            }
            if (iNextTag == 1) {
                boolDecode = ProtoAdapter.BOOL.decode(reader);
            } else if (iNextTag == 2) {
                strDecode = ProtoAdapter.STRING.decode(reader);
            } else if (iNextTag != 3) {
                reader.readUnknownField(iNextTag);
            } else {
                strDecode2 = ProtoAdapter.STRING.decode(reader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter writer, Object obj) throws IOException {
        CalendarReminder value = (CalendarReminder) obj;
        j.g(writer, "writer");
        j.g(value, "value");
        ProtoAdapter.BOOL.encodeWithTag(writer, 1, value.getHas_name());
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(writer, 2, value.getStart_timestamp());
        protoAdapter.encodeWithTag(writer, 3, value.getEnd_timestamp());
        writer.writeBytes(value.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CalendarReminder value = (CalendarReminder) obj;
        j.g(value, "value");
        int iEncodedSizeWithTag = ProtoAdapter.BOOL.encodedSizeWithTag(1, value.getHas_name()) + value.unknownFields().size();
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(3, value.getEnd_timestamp()) + protoAdapter.encodedSizeWithTag(2, value.getStart_timestamp()) + iEncodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CalendarReminder value = (CalendarReminder) obj;
        j.g(value, "value");
        return CalendarReminder.copy$default(value, null, null, null, ByteString.EMPTY, 7, null);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter writer, Object obj) throws IOException {
        CalendarReminder value = (CalendarReminder) obj;
        j.g(writer, "writer");
        j.g(value, "value");
        writer.writeBytes(value.unknownFields());
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(writer, 3, value.getEnd_timestamp());
        protoAdapter.encodeWithTag(writer, 2, value.getStart_timestamp());
        ProtoAdapter.BOOL.encodeWithTag(writer, 1, value.getHas_name());
    }
}
