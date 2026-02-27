package dg;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.internal.Internal;
import dOYHB6.tiZVw8.numX49;
import dde.protobuf.fragments.Contact;
import dde.protobuf.fragments.ContactFragment;
import dde.protobuf.fragments.ExtractionDetails;
import defpackage.AbstractC1414e;
import java.io.IOException;
import java.util.ArrayList;
import okio.ByteString;

/* JADX INFO: renamed from: dg.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1389m extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) throws IOException {
        ArrayList arrayListJ = AbstractC1414e.j(protoReader, numX49.tnTj78("bd5bJ"));
        long jBeginMessage = protoReader.beginMessage();
        ExtractionDetails extractionDetailsDecode = null;
        while (true) {
            int iNextTag = protoReader.nextTag();
            if (iNextTag == -1) {
                return new ContactFragment(extractionDetailsDecode, arrayListJ, protoReader.endMessageAndGetUnknownFields(jBeginMessage));
            }
            if (iNextTag == 1) {
                extractionDetailsDecode = ExtractionDetails.ADAPTER.decode(protoReader);
            } else if (iNextTag != 2) {
                protoReader.readUnknownField(iNextTag);
            } else {
                arrayListJ.add(Contact.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) throws IOException {
        ContactFragment contactFragment = (ContactFragment) obj;
        kotlin.jvm.internal.j.g(protoWriter, numX49.tnTj78("bd5bI"));
        kotlin.jvm.internal.j.g(contactFragment, numX49.tnTj78("bd5bq"));
        if (contactFragment.getExtractionDetails() != null) {
            ExtractionDetails.ADAPTER.encodeWithTag(protoWriter, 1, contactFragment.getExtractionDetails());
        }
        Contact.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, contactFragment.getContacts());
        protoWriter.writeBytes(contactFragment.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ContactFragment contactFragment = (ContactFragment) obj;
        kotlin.jvm.internal.j.g(contactFragment, numX49.tnTj78("bd5bW"));
        int size = contactFragment.unknownFields().size();
        if (contactFragment.getExtractionDetails() != null) {
            size += ExtractionDetails.ADAPTER.encodedSizeWithTag(1, contactFragment.getExtractionDetails());
        }
        return Contact.ADAPTER.asRepeated().encodedSizeWithTag(2, contactFragment.getContacts()) + size;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ContactFragment contactFragment = (ContactFragment) obj;
        kotlin.jvm.internal.j.g(contactFragment, numX49.tnTj78("bd529"));
        ExtractionDetails extractionDetails = contactFragment.getExtractionDetails();
        return contactFragment.copy(extractionDetails != null ? ExtractionDetails.ADAPTER.redact(extractionDetails) : null, Internal.m186redactElements(contactFragment.getContacts(), Contact.ADAPTER), ByteString.EMPTY);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) throws IOException {
        ContactFragment contactFragment = (ContactFragment) obj;
        kotlin.jvm.internal.j.g(reverseProtoWriter, numX49.tnTj78("bd5bz"));
        kotlin.jvm.internal.j.g(contactFragment, numX49.tnTj78("bd5bl"));
        reverseProtoWriter.writeBytes(contactFragment.unknownFields());
        Contact.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 2, contactFragment.getContacts());
        if (contactFragment.getExtractionDetails() != null) {
            ExtractionDetails.ADAPTER.encodeWithTag(reverseProtoWriter, 1, contactFragment.getExtractionDetails());
        }
    }
}
