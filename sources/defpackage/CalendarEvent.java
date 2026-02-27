package defpackage;

import cj.C1110A;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.z;
import okio.ByteString;

/* JADX INFO: loaded from: classes3.dex */
public final class CalendarEvent extends Message {
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", jsonName = "attendeesCount", schemaIndex = 3, tag = 4)
    private final Integer attendees_count;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", jsonName = "confirmedAttendeesCount", schemaIndex = 4, tag = 5)
    private final Integer confirmed_attendees_count;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "endTimestamp", schemaIndex = 6, tag = 7)
    private final String end_timestamp;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "hasName", schemaIndex = 0, tag = 1)
    private final Boolean has_name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isOrganizer", schemaIndex = 1, tag = 2)
    private final Boolean is_organizer;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isRecurring", schemaIndex = 2, tag = 3)
    private final Boolean is_recurring;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "startTimestamp", schemaIndex = 5, tag = 6)
    private final String start_timestamp;
    public static final C1843m Companion = new C1843m();
    public static final ProtoAdapter<CalendarEvent> ADAPTER = new C1793l(FieldEncoding.LENGTH_DELIMITED, z.a(CalendarEvent.class), "type.googleapis.com/CalendarEvent", Syntax.PROTO_3, null, "dde-protobuf/models/calendar.proto");

    public CalendarEvent() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public static /* synthetic */ CalendarEvent copy$default(CalendarEvent calendarEvent, Boolean bool, Boolean bool2, Boolean bool3, Integer num, Integer num2, String str, String str2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = calendarEvent.has_name;
        }
        if ((i & 2) != 0) {
            bool2 = calendarEvent.is_organizer;
        }
        if ((i & 4) != 0) {
            bool3 = calendarEvent.is_recurring;
        }
        if ((i & 8) != 0) {
            num = calendarEvent.attendees_count;
        }
        if ((i & 16) != 0) {
            num2 = calendarEvent.confirmed_attendees_count;
        }
        if ((i & 32) != 0) {
            str = calendarEvent.start_timestamp;
        }
        if ((i & 64) != 0) {
            str2 = calendarEvent.end_timestamp;
        }
        if ((i & 128) != 0) {
            byteString = calendarEvent.unknownFields();
        }
        String str3 = str2;
        ByteString byteString2 = byteString;
        Integer num3 = num2;
        String str4 = str;
        return calendarEvent.copy(bool, bool2, bool3, num, num3, str4, str3, byteString2);
    }

    public final CalendarEvent copy(Boolean bool, Boolean bool2, Boolean bool3, Integer num, Integer num2, String str, String str2, ByteString unknownFields) {
        j.g(unknownFields, "unknownFields");
        return new CalendarEvent(bool, bool2, bool3, num, num2, str, str2, unknownFields);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CalendarEvent)) {
            return false;
        }
        CalendarEvent calendarEvent = (CalendarEvent) obj;
        return j.b(unknownFields(), calendarEvent.unknownFields()) && j.b(this.has_name, calendarEvent.has_name) && j.b(this.is_organizer, calendarEvent.is_organizer) && j.b(this.is_recurring, calendarEvent.is_recurring) && j.b(this.attendees_count, calendarEvent.attendees_count) && j.b(this.confirmed_attendees_count, calendarEvent.confirmed_attendees_count) && j.b(this.start_timestamp, calendarEvent.start_timestamp) && j.b(this.end_timestamp, calendarEvent.end_timestamp);
    }

    public final Integer getAttendees_count() {
        return this.attendees_count;
    }

    public final Integer getConfirmed_attendees_count() {
        return this.confirmed_attendees_count;
    }

    public final String getEnd_timestamp() {
        return this.end_timestamp;
    }

    public final Boolean getHas_name() {
        return this.has_name;
    }

    public final String getStart_timestamp() {
        return this.start_timestamp;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Boolean bool = this.has_name;
        int iHashCode2 = (iHashCode + (bool != null ? bool.hashCode() : 0)) * 37;
        Boolean bool2 = this.is_organizer;
        int iHashCode3 = (iHashCode2 + (bool2 != null ? bool2.hashCode() : 0)) * 37;
        Boolean bool3 = this.is_recurring;
        int iHashCode4 = (iHashCode3 + (bool3 != null ? bool3.hashCode() : 0)) * 37;
        Integer num = this.attendees_count;
        int iHashCode5 = (iHashCode4 + (num != null ? num.hashCode() : 0)) * 37;
        Integer num2 = this.confirmed_attendees_count;
        int iHashCode6 = (iHashCode5 + (num2 != null ? num2.hashCode() : 0)) * 37;
        String str = this.start_timestamp;
        int iHashCode7 = (iHashCode6 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.end_timestamp;
        int iHashCode8 = iHashCode7 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode8;
        return iHashCode8;
    }

    public final Boolean is_organizer() {
        return this.is_organizer;
    }

    public final Boolean is_recurring() {
        return this.is_recurring;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m4newBuilder();
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.has_name != null) {
            AbstractC1414e.q(new StringBuilder("has_name="), this.has_name, arrayList);
        }
        if (this.is_organizer != null) {
            AbstractC1414e.q(new StringBuilder("is_organizer="), this.is_organizer, arrayList);
        }
        if (this.is_recurring != null) {
            AbstractC1414e.q(new StringBuilder("is_recurring="), this.is_recurring, arrayList);
        }
        if (this.attendees_count != null) {
            AbstractC1414e.r(new StringBuilder("attendees_count="), this.attendees_count, arrayList);
        }
        if (this.confirmed_attendees_count != null) {
            AbstractC1414e.r(new StringBuilder("confirmed_attendees_count="), this.confirmed_attendees_count, arrayList);
        }
        if (this.start_timestamp != null) {
            AbstractC1414e.p(this.start_timestamp, new StringBuilder("start_timestamp="), arrayList);
        }
        if (this.end_timestamp != null) {
            AbstractC1414e.p(this.end_timestamp, new StringBuilder("end_timestamp="), arrayList);
        }
        return C1110A.F(arrayList, ", ", "CalendarEvent{", "}", null, 56);
    }

    public /* synthetic */ CalendarEvent(Boolean bool, Boolean bool2, Boolean bool3, Integer num, Integer num2, String str, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : bool2, (i & 4) != 0 ? null : bool3, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : num2, (i & 32) != 0 ? null : str, (i & 64) != 0 ? null : str2, (i & 128) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m4newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CalendarEvent(Boolean bool, Boolean bool2, Boolean bool3, Integer num, Integer num2, String str, String str2, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        j.g(unknownFields, "unknownFields");
        this.has_name = bool;
        this.is_organizer = bool2;
        this.is_recurring = bool3;
        this.attendees_count = num;
        this.confirmed_attendees_count = num2;
        this.start_timestamp = str;
        this.end_timestamp = str2;
    }
}
