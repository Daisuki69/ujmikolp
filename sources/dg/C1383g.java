package dg;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.internal.Internal;
import dOYHB6.tiZVw8.numX49;
import dde.protobuf.fragments.CalendarFragment;
import dde.protobuf.fragments.Event;
import dde.protobuf.fragments.ExtractionDetails;
import dde.protobuf.fragments.Reminder;
import defpackage.AbstractC1414e;
import java.io.IOException;
import java.util.ArrayList;
import okio.ByteString;

/* JADX INFO: renamed from: dg.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1383g extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) throws IOException {
        ArrayList arrayListJ = AbstractC1414e.j(protoReader, numX49.tnTj78("bd5bG"));
        ArrayList arrayList = new ArrayList();
        long jBeginMessage = protoReader.beginMessage();
        ExtractionDetails extractionDetailsDecode = null;
        while (true) {
            int iNextTag = protoReader.nextTag();
            if (iNextTag == -1) {
                return new CalendarFragment(extractionDetailsDecode, arrayListJ, arrayList, protoReader.endMessageAndGetUnknownFields(jBeginMessage));
            }
            if (iNextTag == 1) {
                extractionDetailsDecode = ExtractionDetails.ADAPTER.decode(protoReader);
            } else if (iNextTag == 2) {
                arrayListJ.add(Event.ADAPTER.decode(protoReader));
            } else if (iNextTag != 3) {
                protoReader.readUnknownField(iNextTag);
            } else {
                arrayList.add(Reminder.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) throws IOException {
        CalendarFragment calendarFragment = (CalendarFragment) obj;
        kotlin.jvm.internal.j.g(protoWriter, numX49.tnTj78("bd5b3"));
        kotlin.jvm.internal.j.g(calendarFragment, numX49.tnTj78("bd5by"));
        if (calendarFragment.getExtractionDetails() != null) {
            ExtractionDetails.ADAPTER.encodeWithTag(protoWriter, 1, calendarFragment.getExtractionDetails());
        }
        Event.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, calendarFragment.getEvents());
        Reminder.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, calendarFragment.getReminders());
        protoWriter.writeBytes(calendarFragment.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CalendarFragment calendarFragment = (CalendarFragment) obj;
        kotlin.jvm.internal.j.g(calendarFragment, numX49.tnTj78("bd5bA"));
        int size = calendarFragment.unknownFields().size();
        if (calendarFragment.getExtractionDetails() != null) {
            size += ExtractionDetails.ADAPTER.encodedSizeWithTag(1, calendarFragment.getExtractionDetails());
        }
        return Reminder.ADAPTER.asRepeated().encodedSizeWithTag(3, calendarFragment.getReminders()) + Event.ADAPTER.asRepeated().encodedSizeWithTag(2, calendarFragment.getEvents()) + size;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CalendarFragment calendarFragment = (CalendarFragment) obj;
        kotlin.jvm.internal.j.g(calendarFragment, numX49.tnTj78("bd5bY"));
        ExtractionDetails extractionDetails = calendarFragment.getExtractionDetails();
        return calendarFragment.copy(extractionDetails != null ? ExtractionDetails.ADAPTER.redact(extractionDetails) : null, Internal.m186redactElements(calendarFragment.getEvents(), Event.ADAPTER), Internal.m186redactElements(calendarFragment.getReminders(), Reminder.ADAPTER), ByteString.EMPTY);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) throws IOException {
        CalendarFragment calendarFragment = (CalendarFragment) obj;
        kotlin.jvm.internal.j.g(reverseProtoWriter, numX49.tnTj78("bd5bv"));
        kotlin.jvm.internal.j.g(calendarFragment, numX49.tnTj78("bd5b7"));
        reverseProtoWriter.writeBytes(calendarFragment.unknownFields());
        Reminder.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 3, calendarFragment.getReminders());
        Event.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 2, calendarFragment.getEvents());
        if (calendarFragment.getExtractionDetails() != null) {
            ExtractionDetails.ADAPTER.encodeWithTag(reverseProtoWriter, 1, calendarFragment.getExtractionDetails());
        }
    }
}
