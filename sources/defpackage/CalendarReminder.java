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
public final class CalendarReminder extends Message {
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "endTimestamp", schemaIndex = 2, tag = 3)
    private final String end_timestamp;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "hasName", schemaIndex = 0, tag = 1)
    private final Boolean has_name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "startTimestamp", schemaIndex = 1, tag = 2)
    private final String start_timestamp;
    public static final C1952o Companion = new C1952o();
    public static final ProtoAdapter<CalendarReminder> ADAPTER = new C1869n(FieldEncoding.LENGTH_DELIMITED, z.a(CalendarReminder.class), "type.googleapis.com/CalendarReminder", Syntax.PROTO_3, null, "dde-protobuf/models/calendar.proto");

    public CalendarReminder() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ CalendarReminder copy$default(CalendarReminder calendarReminder, Boolean bool, String str, String str2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = calendarReminder.has_name;
        }
        if ((i & 2) != 0) {
            str = calendarReminder.start_timestamp;
        }
        if ((i & 4) != 0) {
            str2 = calendarReminder.end_timestamp;
        }
        if ((i & 8) != 0) {
            byteString = calendarReminder.unknownFields();
        }
        return calendarReminder.copy(bool, str, str2, byteString);
    }

    public final CalendarReminder copy(Boolean bool, String str, String str2, ByteString unknownFields) {
        j.g(unknownFields, "unknownFields");
        return new CalendarReminder(bool, str, str2, unknownFields);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CalendarReminder)) {
            return false;
        }
        CalendarReminder calendarReminder = (CalendarReminder) obj;
        return j.b(unknownFields(), calendarReminder.unknownFields()) && j.b(this.has_name, calendarReminder.has_name) && j.b(this.start_timestamp, calendarReminder.start_timestamp) && j.b(this.end_timestamp, calendarReminder.end_timestamp);
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
        String str = this.start_timestamp;
        int iHashCode3 = (iHashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.end_timestamp;
        int iHashCode4 = iHashCode3 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m5newBuilder();
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.has_name != null) {
            AbstractC1414e.q(new StringBuilder("has_name="), this.has_name, arrayList);
        }
        if (this.start_timestamp != null) {
            AbstractC1414e.p(this.start_timestamp, new StringBuilder("start_timestamp="), arrayList);
        }
        if (this.end_timestamp != null) {
            AbstractC1414e.p(this.end_timestamp, new StringBuilder("end_timestamp="), arrayList);
        }
        return C1110A.F(arrayList, ", ", "CalendarReminder{", "}", null, 56);
    }

    public /* synthetic */ CalendarReminder(Boolean bool, String str, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m5newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CalendarReminder(Boolean bool, String str, String str2, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        j.g(unknownFields, "unknownFields");
        this.has_name = bool;
        this.start_timestamp = str;
        this.end_timestamp = str2;
    }
}
