package dde.protobuf.fragments;

import cj.C1110A;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import defpackage.AbstractC1414e;
import dg.C1393q;
import dg.r;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.z;
import okio.ByteString;

/* JADX INFO: loaded from: classes4.dex */
public final class Event extends Message {
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", schemaIndex = 3, tag = 4)
    private final Integer attendeesCount;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", schemaIndex = 4, tag = 5)
    private final Integer confirmedAttendeesCount;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 6, tag = 7)
    private final String end;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 0, tag = 1)
    private final Boolean hasName;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 1, tag = 2)
    private final Boolean isOrganizer;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 2, tag = 3)
    private final Boolean isRecurring;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 5, tag = 6)
    private final String start;
    public static final r Companion = new r();
    public static final ProtoAdapter<Event> ADAPTER = new C1393q(FieldEncoding.LENGTH_DELIMITED, z.a(Event.class), "type.googleapis.com/dde.protobuf.fragments.Event", Syntax.PROTO_3, null, "dde-protobuf/fragments/Event.proto");

    public Event() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public static /* synthetic */ Event copy$default(Event event, Boolean bool, Boolean bool2, Boolean bool3, Integer num, Integer num2, String str, String str2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = event.hasName;
        }
        if ((i & 2) != 0) {
            bool2 = event.isOrganizer;
        }
        if ((i & 4) != 0) {
            bool3 = event.isRecurring;
        }
        if ((i & 8) != 0) {
            num = event.attendeesCount;
        }
        if ((i & 16) != 0) {
            num2 = event.confirmedAttendeesCount;
        }
        if ((i & 32) != 0) {
            str = event.start;
        }
        if ((i & 64) != 0) {
            str2 = event.end;
        }
        if ((i & 128) != 0) {
            byteString = event.unknownFields();
        }
        String str3 = str2;
        ByteString byteString2 = byteString;
        Integer num3 = num2;
        String str4 = str;
        return event.copy(bool, bool2, bool3, num, num3, str4, str3, byteString2);
    }

    public final Event copy(Boolean bool, Boolean bool2, Boolean bool3, Integer num, Integer num2, String str, String str2, ByteString unknownFields) {
        j.g(unknownFields, "unknownFields");
        return new Event(bool, bool2, bool3, num, num2, str, str2, unknownFields);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Event)) {
            return false;
        }
        Event event = (Event) obj;
        return j.b(unknownFields(), event.unknownFields()) && j.b(this.hasName, event.hasName) && j.b(this.isOrganizer, event.isOrganizer) && j.b(this.isRecurring, event.isRecurring) && j.b(this.attendeesCount, event.attendeesCount) && j.b(this.confirmedAttendeesCount, event.confirmedAttendeesCount) && j.b(this.start, event.start) && j.b(this.end, event.end);
    }

    public final Integer getAttendeesCount() {
        return this.attendeesCount;
    }

    public final Integer getConfirmedAttendeesCount() {
        return this.confirmedAttendeesCount;
    }

    public final String getEnd() {
        return this.end;
    }

    public final Boolean getHasName() {
        return this.hasName;
    }

    public final String getStart() {
        return this.start;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Boolean bool = this.hasName;
        int iHashCode2 = (iHashCode + (bool != null ? bool.hashCode() : 0)) * 37;
        Boolean bool2 = this.isOrganizer;
        int iHashCode3 = (iHashCode2 + (bool2 != null ? bool2.hashCode() : 0)) * 37;
        Boolean bool3 = this.isRecurring;
        int iHashCode4 = (iHashCode3 + (bool3 != null ? bool3.hashCode() : 0)) * 37;
        Integer num = this.attendeesCount;
        int iHashCode5 = (iHashCode4 + (num != null ? num.hashCode() : 0)) * 37;
        Integer num2 = this.confirmedAttendeesCount;
        int iHashCode6 = (iHashCode5 + (num2 != null ? num2.hashCode() : 0)) * 37;
        String str = this.start;
        int iHashCode7 = (iHashCode6 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.end;
        int iHashCode8 = iHashCode7 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode8;
        return iHashCode8;
    }

    public final Boolean isOrganizer() {
        return this.isOrganizer;
    }

    public final Boolean isRecurring() {
        return this.isRecurring;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m234newBuilder();
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.hasName != null) {
            AbstractC1414e.q(new StringBuilder("hasName="), this.hasName, arrayList);
        }
        if (this.isOrganizer != null) {
            AbstractC1414e.q(new StringBuilder("isOrganizer="), this.isOrganizer, arrayList);
        }
        if (this.isRecurring != null) {
            AbstractC1414e.q(new StringBuilder("isRecurring="), this.isRecurring, arrayList);
        }
        if (this.attendeesCount != null) {
            AbstractC1414e.r(new StringBuilder("attendeesCount="), this.attendeesCount, arrayList);
        }
        if (this.confirmedAttendeesCount != null) {
            AbstractC1414e.r(new StringBuilder("confirmedAttendeesCount="), this.confirmedAttendeesCount, arrayList);
        }
        if (this.start != null) {
            AbstractC1414e.p(this.start, new StringBuilder("start="), arrayList);
        }
        if (this.end != null) {
            AbstractC1414e.p(this.end, new StringBuilder("end="), arrayList);
        }
        return C1110A.F(arrayList, ", ", "Event{", "}", null, 56);
    }

    public /* synthetic */ Event(Boolean bool, Boolean bool2, Boolean bool3, Integer num, Integer num2, String str, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : bool2, (i & 4) != 0 ? null : bool3, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : num2, (i & 32) != 0 ? null : str, (i & 64) != 0 ? null : str2, (i & 128) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m234newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Event(Boolean bool, Boolean bool2, Boolean bool3, Integer num, Integer num2, String str, String str2, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        j.g(unknownFields, "unknownFields");
        this.hasName = bool;
        this.isOrganizer = bool2;
        this.isRecurring = bool3;
        this.attendeesCount = num;
        this.confirmedAttendeesCount = num2;
        this.start = str;
        this.end = str2;
    }
}
