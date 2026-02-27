package dde.protobuf.fragments;

import cj.C1110A;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import defpackage.AbstractC1414e;
import dg.C1387k;
import dg.C1388l;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.z;
import okio.ByteString;

/* JADX INFO: loaded from: classes4.dex */
public final class Contact extends Message {
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", schemaIndex = 3, tag = 4)
    private final Integer emailCount;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 0, tag = 1)
    private final Boolean hasName;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 1, tag = 2)
    private final Boolean hasPhoto;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", schemaIndex = 2, tag = 3)
    private final Integer phoneNumberCount;
    public static final C1388l Companion = new C1388l();
    public static final ProtoAdapter<Contact> ADAPTER = new C1387k(FieldEncoding.LENGTH_DELIMITED, z.a(Contact.class), "type.googleapis.com/dde.protobuf.fragments.Contact", Syntax.PROTO_3, null, "dde-protobuf/fragments/Contact.proto");

    public Contact() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ Contact copy$default(Contact contact, Boolean bool, Boolean bool2, Integer num, Integer num2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = contact.hasName;
        }
        if ((i & 2) != 0) {
            bool2 = contact.hasPhoto;
        }
        if ((i & 4) != 0) {
            num = contact.phoneNumberCount;
        }
        if ((i & 8) != 0) {
            num2 = contact.emailCount;
        }
        if ((i & 16) != 0) {
            byteString = contact.unknownFields();
        }
        ByteString byteString2 = byteString;
        Integer num3 = num;
        return contact.copy(bool, bool2, num3, num2, byteString2);
    }

    public final Contact copy(Boolean bool, Boolean bool2, Integer num, Integer num2, ByteString unknownFields) {
        j.g(unknownFields, "unknownFields");
        return new Contact(bool, bool2, num, num2, unknownFields);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Contact)) {
            return false;
        }
        Contact contact = (Contact) obj;
        return j.b(unknownFields(), contact.unknownFields()) && j.b(this.hasName, contact.hasName) && j.b(this.hasPhoto, contact.hasPhoto) && j.b(this.phoneNumberCount, contact.phoneNumberCount) && j.b(this.emailCount, contact.emailCount);
    }

    public final Integer getEmailCount() {
        return this.emailCount;
    }

    public final Boolean getHasName() {
        return this.hasName;
    }

    public final Boolean getHasPhoto() {
        return this.hasPhoto;
    }

    public final Integer getPhoneNumberCount() {
        return this.phoneNumberCount;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Boolean bool = this.hasName;
        int iHashCode2 = (iHashCode + (bool != null ? bool.hashCode() : 0)) * 37;
        Boolean bool2 = this.hasPhoto;
        int iHashCode3 = (iHashCode2 + (bool2 != null ? bool2.hashCode() : 0)) * 37;
        Integer num = this.phoneNumberCount;
        int iHashCode4 = (iHashCode3 + (num != null ? num.hashCode() : 0)) * 37;
        Integer num2 = this.emailCount;
        int iHashCode5 = iHashCode4 + (num2 != null ? num2.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m231newBuilder();
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.hasName != null) {
            AbstractC1414e.q(new StringBuilder("hasName="), this.hasName, arrayList);
        }
        if (this.hasPhoto != null) {
            AbstractC1414e.q(new StringBuilder("hasPhoto="), this.hasPhoto, arrayList);
        }
        if (this.phoneNumberCount != null) {
            AbstractC1414e.r(new StringBuilder("phoneNumberCount="), this.phoneNumberCount, arrayList);
        }
        if (this.emailCount != null) {
            AbstractC1414e.r(new StringBuilder("emailCount="), this.emailCount, arrayList);
        }
        return C1110A.F(arrayList, ", ", "Contact{", "}", null, 56);
    }

    public /* synthetic */ Contact(Boolean bool, Boolean bool2, Integer num, Integer num2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : bool2, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : num2, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m231newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Contact(Boolean bool, Boolean bool2, Integer num, Integer num2, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        j.g(unknownFields, "unknownFields");
        this.hasName = bool;
        this.hasPhoto = bool2;
        this.phoneNumberCount = num;
        this.emailCount = num2;
    }
}
