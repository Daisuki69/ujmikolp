package defpackage;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.io.IOException;
import kotlin.jvm.internal.j;
import okio.ByteString;

/* JADX INFO: renamed from: l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1793l extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader reader) throws IOException {
        j.g(reader, "reader");
        long jBeginMessage = reader.beginMessage();
        Boolean boolDecode = null;
        Boolean boolDecode2 = null;
        Boolean boolDecode3 = null;
        Integer numDecode = null;
        Integer numDecode2 = null;
        String strDecode = null;
        String strDecode2 = null;
        while (true) {
            int iNextTag = reader.nextTag();
            if (iNextTag == -1) {
                return new CalendarEvent(boolDecode, boolDecode2, boolDecode3, numDecode, numDecode2, strDecode, strDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
            }
            switch (iNextTag) {
                case 1:
                    boolDecode = ProtoAdapter.BOOL.decode(reader);
                    break;
                case 2:
                    boolDecode2 = ProtoAdapter.BOOL.decode(reader);
                    break;
                case 3:
                    boolDecode3 = ProtoAdapter.BOOL.decode(reader);
                    break;
                case 4:
                    numDecode = ProtoAdapter.UINT32.decode(reader);
                    break;
                case 5:
                    numDecode2 = ProtoAdapter.UINT32.decode(reader);
                    break;
                case 6:
                    strDecode = ProtoAdapter.STRING.decode(reader);
                    break;
                case 7:
                    strDecode2 = ProtoAdapter.STRING.decode(reader);
                    break;
                default:
                    reader.readUnknownField(iNextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter writer, Object obj) throws IOException {
        CalendarEvent value = (CalendarEvent) obj;
        j.g(writer, "writer");
        j.g(value, "value");
        ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
        protoAdapter.encodeWithTag(writer, 1, value.getHas_name());
        protoAdapter.encodeWithTag(writer, 2, value.is_organizer());
        protoAdapter.encodeWithTag(writer, 3, value.is_recurring());
        ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.UINT32;
        protoAdapter2.encodeWithTag(writer, 4, value.getAttendees_count());
        protoAdapter2.encodeWithTag(writer, 5, value.getConfirmed_attendees_count());
        ProtoAdapter<String> protoAdapter3 = ProtoAdapter.STRING;
        protoAdapter3.encodeWithTag(writer, 6, value.getStart_timestamp());
        protoAdapter3.encodeWithTag(writer, 7, value.getEnd_timestamp());
        writer.writeBytes(value.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CalendarEvent value = (CalendarEvent) obj;
        j.g(value, "value");
        int size = value.unknownFields().size();
        ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
        int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(3, value.is_recurring()) + protoAdapter.encodedSizeWithTag(2, value.is_organizer()) + protoAdapter.encodedSizeWithTag(1, value.getHas_name()) + size;
        ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.UINT32;
        int iEncodedSizeWithTag2 = protoAdapter2.encodedSizeWithTag(5, value.getConfirmed_attendees_count()) + protoAdapter2.encodedSizeWithTag(4, value.getAttendees_count()) + iEncodedSizeWithTag;
        ProtoAdapter<String> protoAdapter3 = ProtoAdapter.STRING;
        return protoAdapter3.encodedSizeWithTag(7, value.getEnd_timestamp()) + protoAdapter3.encodedSizeWithTag(6, value.getStart_timestamp()) + iEncodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CalendarEvent value = (CalendarEvent) obj;
        j.g(value, "value");
        return CalendarEvent.copy$default(value, null, null, null, null, null, null, null, ByteString.EMPTY, 127, null);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter writer, Object obj) throws IOException {
        CalendarEvent value = (CalendarEvent) obj;
        j.g(writer, "writer");
        j.g(value, "value");
        writer.writeBytes(value.unknownFields());
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(writer, 7, value.getEnd_timestamp());
        protoAdapter.encodeWithTag(writer, 6, value.getStart_timestamp());
        ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.UINT32;
        protoAdapter2.encodeWithTag(writer, 5, value.getConfirmed_attendees_count());
        protoAdapter2.encodeWithTag(writer, 4, value.getAttendees_count());
        ProtoAdapter<Boolean> protoAdapter3 = ProtoAdapter.BOOL;
        protoAdapter3.encodeWithTag(writer, 3, value.is_recurring());
        protoAdapter3.encodeWithTag(writer, 2, value.is_organizer());
        protoAdapter3.encodeWithTag(writer, 1, value.getHas_name());
    }
}
