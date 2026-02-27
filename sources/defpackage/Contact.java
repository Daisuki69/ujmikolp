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
public final class Contact extends Message {
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", jsonName = "emailCount", schemaIndex = 3, tag = 4)
    private final Integer email_count;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "hasName", schemaIndex = 0, tag = 1)
    private final Boolean has_name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "hasPhoto", schemaIndex = 1, tag = 2)
    private final Boolean has_photo;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", jsonName = "phoneNumberCount", schemaIndex = 2, tag = 3)
    private final Integer phone_number_count;
    public static final C2358w Companion = new C2358w();
    public static final ProtoAdapter<Contact> ADAPTER = new C2325v(FieldEncoding.LENGTH_DELIMITED, z.a(Contact.class), "type.googleapis.com/Contact", Syntax.PROTO_3, null, "dde-protobuf/models/contact.proto");

    public Contact() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ Contact copy$default(Contact contact, Boolean bool, Boolean bool2, Integer num, Integer num2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = contact.has_name;
        }
        if ((i & 2) != 0) {
            bool2 = contact.has_photo;
        }
        if ((i & 4) != 0) {
            num = contact.phone_number_count;
        }
        if ((i & 8) != 0) {
            num2 = contact.email_count;
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
        return j.b(unknownFields(), contact.unknownFields()) && j.b(this.has_name, contact.has_name) && j.b(this.has_photo, contact.has_photo) && j.b(this.phone_number_count, contact.phone_number_count) && j.b(this.email_count, contact.email_count);
    }

    public final Integer getEmail_count() {
        return this.email_count;
    }

    public final Boolean getHas_name() {
        return this.has_name;
    }

    public final Boolean getHas_photo() {
        return this.has_photo;
    }

    public final Integer getPhone_number_count() {
        return this.phone_number_count;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Boolean bool = this.has_name;
        int iHashCode2 = (iHashCode + (bool != null ? bool.hashCode() : 0)) * 37;
        Boolean bool2 = this.has_photo;
        int iHashCode3 = (iHashCode2 + (bool2 != null ? bool2.hashCode() : 0)) * 37;
        Integer num = this.phone_number_count;
        int iHashCode4 = (iHashCode3 + (num != null ? num.hashCode() : 0)) * 37;
        Integer num2 = this.email_count;
        int iHashCode5 = iHashCode4 + (num2 != null ? num2.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m9newBuilder();
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.has_name != null) {
            AbstractC1414e.q(new StringBuilder("has_name="), this.has_name, arrayList);
        }
        if (this.has_photo != null) {
            AbstractC1414e.q(new StringBuilder("has_photo="), this.has_photo, arrayList);
        }
        if (this.phone_number_count != null) {
            AbstractC1414e.r(new StringBuilder("phone_number_count="), this.phone_number_count, arrayList);
        }
        if (this.email_count != null) {
            AbstractC1414e.r(new StringBuilder("email_count="), this.email_count, arrayList);
        }
        return C1110A.F(arrayList, ", ", "Contact{", "}", null, 56);
    }

    public /* synthetic */ Contact(Boolean bool, Boolean bool2, Integer num, Integer num2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : bool2, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : num2, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m9newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Contact(Boolean bool, Boolean bool2, Integer num, Integer num2, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        j.g(unknownFields, "unknownFields");
        this.has_name = bool;
        this.has_photo = bool2;
        this.phone_number_count = num;
        this.email_count = num2;
    }
}
