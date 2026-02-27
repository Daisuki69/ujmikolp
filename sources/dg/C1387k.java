package dg;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import dOYHB6.tiZVw8.numX49;
import dde.protobuf.fragments.Contact;
import java.io.IOException;
import okio.ByteString;

/* JADX INFO: renamed from: dg.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1387k extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) throws IOException {
        kotlin.jvm.internal.j.g(protoReader, numX49.tnTj78("bd5bC"));
        long jBeginMessage = protoReader.beginMessage();
        Boolean boolDecode = null;
        Boolean boolDecode2 = null;
        Integer numDecode = null;
        Integer numDecode2 = null;
        while (true) {
            int iNextTag = protoReader.nextTag();
            if (iNextTag == -1) {
                return new Contact(boolDecode, boolDecode2, numDecode, numDecode2, protoReader.endMessageAndGetUnknownFields(jBeginMessage));
            }
            if (iNextTag == 1) {
                boolDecode = ProtoAdapter.BOOL.decode(protoReader);
            } else if (iNextTag == 2) {
                boolDecode2 = ProtoAdapter.BOOL.decode(protoReader);
            } else if (iNextTag == 3) {
                numDecode = ProtoAdapter.UINT32.decode(protoReader);
            } else if (iNextTag != 4) {
                protoReader.readUnknownField(iNextTag);
            } else {
                numDecode2 = ProtoAdapter.UINT32.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) throws IOException {
        Contact contact = (Contact) obj;
        kotlin.jvm.internal.j.g(protoWriter, numX49.tnTj78("bd5b4"));
        kotlin.jvm.internal.j.g(contact, numX49.tnTj78("bd5bo"));
        ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
        protoAdapter.encodeWithTag(protoWriter, 1, contact.getHasName());
        protoAdapter.encodeWithTag(protoWriter, 2, contact.getHasPhoto());
        ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.UINT32;
        protoAdapter2.encodeWithTag(protoWriter, 3, contact.getPhoneNumberCount());
        protoAdapter2.encodeWithTag(protoWriter, 4, contact.getEmailCount());
        protoWriter.writeBytes(contact.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Contact contact = (Contact) obj;
        kotlin.jvm.internal.j.g(contact, numX49.tnTj78("bd5bc"));
        int size = contact.unknownFields().size();
        ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
        int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(2, contact.getHasPhoto()) + protoAdapter.encodedSizeWithTag(1, contact.getHasName()) + size;
        ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.UINT32;
        return protoAdapter2.encodedSizeWithTag(4, contact.getEmailCount()) + protoAdapter2.encodedSizeWithTag(3, contact.getPhoneNumberCount()) + iEncodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Contact contact = (Contact) obj;
        kotlin.jvm.internal.j.g(contact, numX49.tnTj78("bd5bm"));
        return Contact.copy$default(contact, null, null, null, null, ByteString.EMPTY, 15, null);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) throws IOException {
        Contact contact = (Contact) obj;
        kotlin.jvm.internal.j.g(reverseProtoWriter, numX49.tnTj78("bd5bK"));
        kotlin.jvm.internal.j.g(contact, numX49.tnTj78("bd5bw"));
        reverseProtoWriter.writeBytes(contact.unknownFields());
        ProtoAdapter<Integer> protoAdapter = ProtoAdapter.UINT32;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, contact.getEmailCount());
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, contact.getPhoneNumberCount());
        ProtoAdapter<Boolean> protoAdapter2 = ProtoAdapter.BOOL;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 2, contact.getHasPhoto());
        protoAdapter2.encodeWithTag(reverseProtoWriter, 1, contact.getHasName());
    }
}
