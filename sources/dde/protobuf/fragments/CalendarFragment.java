package dde.protobuf.fragments;

import cj.C1110A;
import cj.C1112C;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import defpackage.AbstractC1414e;
import dg.C1383g;
import dg.C1384h;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.z;
import okio.ByteString;

/* JADX INFO: loaded from: classes4.dex */
public final class CalendarFragment extends Message {
    private static final long serialVersionUID = 0;

    @WireField(adapter = "dde.protobuf.fragments.Event#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 1, tag = 2)
    private final List<Event> events;

    @WireField(adapter = "dde.protobuf.fragments.ExtractionDetails#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final ExtractionDetails extractionDetails;

    @WireField(adapter = "dde.protobuf.fragments.Reminder#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 2, tag = 3)
    private final List<Reminder> reminders;
    public static final C1384h Companion = new C1384h();
    public static final ProtoAdapter<CalendarFragment> ADAPTER = new C1383g(FieldEncoding.LENGTH_DELIMITED, z.a(CalendarFragment.class), "type.googleapis.com/dde.protobuf.fragments.CalendarFragment", Syntax.PROTO_3, null, "dde-protobuf/fragments/CalendarFragment.proto");

    public CalendarFragment() {
        this(null, null, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CalendarFragment copy$default(CalendarFragment calendarFragment, ExtractionDetails extractionDetails, List list, List list2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            extractionDetails = calendarFragment.extractionDetails;
        }
        if ((i & 2) != 0) {
            list = calendarFragment.events;
        }
        if ((i & 4) != 0) {
            list2 = calendarFragment.reminders;
        }
        if ((i & 8) != 0) {
            byteString = calendarFragment.unknownFields();
        }
        return calendarFragment.copy(extractionDetails, list, list2, byteString);
    }

    public final CalendarFragment copy(ExtractionDetails extractionDetails, List<Event> events, List<Reminder> reminders, ByteString unknownFields) {
        j.g(events, "events");
        j.g(reminders, "reminders");
        j.g(unknownFields, "unknownFields");
        return new CalendarFragment(extractionDetails, events, reminders, unknownFields);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CalendarFragment)) {
            return false;
        }
        CalendarFragment calendarFragment = (CalendarFragment) obj;
        return j.b(unknownFields(), calendarFragment.unknownFields()) && j.b(this.extractionDetails, calendarFragment.extractionDetails) && j.b(this.events, calendarFragment.events) && j.b(this.reminders, calendarFragment.reminders);
    }

    public final List<Event> getEvents() {
        return this.events;
    }

    public final ExtractionDetails getExtractionDetails() {
        return this.extractionDetails;
    }

    public final List<Reminder> getReminders() {
        return this.reminders;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        ExtractionDetails extractionDetails = this.extractionDetails;
        int iHashCode2 = this.reminders.hashCode() + AbstractC1414e.d(this.events, (iHashCode + (extractionDetails != null ? extractionDetails.hashCode() : 0)) * 37, 37);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m229newBuilder();
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.extractionDetails != null) {
            arrayList.add("extractionDetails=" + this.extractionDetails);
        }
        if (!this.events.isEmpty()) {
            AbstractC1414e.s(new StringBuilder("events="), this.events, arrayList);
        }
        if (!this.reminders.isEmpty()) {
            AbstractC1414e.s(new StringBuilder("reminders="), this.reminders, arrayList);
        }
        return C1110A.F(arrayList, ", ", "CalendarFragment{", "}", null, 56);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CalendarFragment(ExtractionDetails extractionDetails, List<Event> events, List<Reminder> reminders, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        j.g(events, "events");
        j.g(reminders, "reminders");
        j.g(unknownFields, "unknownFields");
        this.extractionDetails = extractionDetails;
        this.events = Internal.immutableCopyOf("events", events);
        this.reminders = Internal.immutableCopyOf("reminders", reminders);
    }

    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m229newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public CalendarFragment(ExtractionDetails extractionDetails, List list, List list2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : extractionDetails, (i & 2) != 0 ? C1112C.f9377a : list, (i & 4) != 0 ? C1112C.f9377a : list2, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }
}
