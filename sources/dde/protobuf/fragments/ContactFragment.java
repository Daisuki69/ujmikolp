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
import dg.C1389m;
import dg.C1390n;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.z;
import okio.ByteString;

/* JADX INFO: loaded from: classes4.dex */
public final class ContactFragment extends Message {
    private static final long serialVersionUID = 0;

    @WireField(adapter = "dde.protobuf.fragments.Contact#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 1, tag = 2)
    private final List<Contact> contacts;

    @WireField(adapter = "dde.protobuf.fragments.ExtractionDetails#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final ExtractionDetails extractionDetails;
    public static final C1390n Companion = new C1390n();
    public static final ProtoAdapter<ContactFragment> ADAPTER = new C1389m(FieldEncoding.LENGTH_DELIMITED, z.a(ContactFragment.class), "type.googleapis.com/dde.protobuf.fragments.ContactFragment", Syntax.PROTO_3, null, "dde-protobuf/fragments/ContactFragment.proto");

    public ContactFragment() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ContactFragment copy$default(ContactFragment contactFragment, ExtractionDetails extractionDetails, List list, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            extractionDetails = contactFragment.extractionDetails;
        }
        if ((i & 2) != 0) {
            list = contactFragment.contacts;
        }
        if ((i & 4) != 0) {
            byteString = contactFragment.unknownFields();
        }
        return contactFragment.copy(extractionDetails, list, byteString);
    }

    public final ContactFragment copy(ExtractionDetails extractionDetails, List<Contact> contacts, ByteString unknownFields) {
        j.g(contacts, "contacts");
        j.g(unknownFields, "unknownFields");
        return new ContactFragment(extractionDetails, contacts, unknownFields);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ContactFragment)) {
            return false;
        }
        ContactFragment contactFragment = (ContactFragment) obj;
        return j.b(unknownFields(), contactFragment.unknownFields()) && j.b(this.extractionDetails, contactFragment.extractionDetails) && j.b(this.contacts, contactFragment.contacts);
    }

    public final List<Contact> getContacts() {
        return this.contacts;
    }

    public final ExtractionDetails getExtractionDetails() {
        return this.extractionDetails;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        ExtractionDetails extractionDetails = this.extractionDetails;
        int iHashCode2 = this.contacts.hashCode() + ((iHashCode + (extractionDetails != null ? extractionDetails.hashCode() : 0)) * 37);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m232newBuilder();
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.extractionDetails != null) {
            arrayList.add("extractionDetails=" + this.extractionDetails);
        }
        if (!this.contacts.isEmpty()) {
            AbstractC1414e.s(new StringBuilder("contacts="), this.contacts, arrayList);
        }
        return C1110A.F(arrayList, ", ", "ContactFragment{", "}", null, 56);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContactFragment(ExtractionDetails extractionDetails, List<Contact> contacts, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        j.g(contacts, "contacts");
        j.g(unknownFields, "unknownFields");
        this.extractionDetails = extractionDetails;
        this.contacts = Internal.immutableCopyOf("contacts", contacts);
    }

    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m232newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public ContactFragment(ExtractionDetails extractionDetails, List list, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : extractionDetails, (i & 2) != 0 ? C1112C.f9377a : list, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }
}
