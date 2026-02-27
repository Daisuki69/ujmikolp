package dg;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.internal.Internal;
import dOYHB6.tiZVw8.numX49;
import dde.protobuf.fragments.Application;
import dde.protobuf.fragments.ExtractionDetails;
import dde.protobuf.fragments.InstalledAppsFragment;
import defpackage.AbstractC1414e;
import java.io.IOException;
import java.util.ArrayList;
import okio.ByteString;

/* JADX INFO: renamed from: dg.E, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1371E extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) throws IOException {
        ArrayList arrayListJ = AbstractC1414e.j(protoReader, numX49.tnTj78("bd5c"));
        long jBeginMessage = protoReader.beginMessage();
        ExtractionDetails extractionDetailsDecode = null;
        while (true) {
            int iNextTag = protoReader.nextTag();
            if (iNextTag == -1) {
                return new InstalledAppsFragment(extractionDetailsDecode, arrayListJ, protoReader.endMessageAndGetUnknownFields(jBeginMessage));
            }
            if (iNextTag == 1) {
                extractionDetailsDecode = ExtractionDetails.ADAPTER.decode(protoReader);
            } else if (iNextTag != 2) {
                protoReader.readUnknownField(iNextTag);
            } else {
                arrayListJ.add(Application.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) throws IOException {
        InstalledAppsFragment installedAppsFragment = (InstalledAppsFragment) obj;
        kotlin.jvm.internal.j.g(protoWriter, numX49.tnTj78("bd5m"));
        kotlin.jvm.internal.j.g(installedAppsFragment, numX49.tnTj78("bd5D"));
        if (installedAppsFragment.getExtractionDetails() != null) {
            ExtractionDetails.ADAPTER.encodeWithTag(protoWriter, 1, installedAppsFragment.getExtractionDetails());
        }
        Application.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, installedAppsFragment.getApplications());
        protoWriter.writeBytes(installedAppsFragment.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        InstalledAppsFragment installedAppsFragment = (InstalledAppsFragment) obj;
        kotlin.jvm.internal.j.g(installedAppsFragment, numX49.tnTj78("bd5N"));
        int size = installedAppsFragment.unknownFields().size();
        if (installedAppsFragment.getExtractionDetails() != null) {
            size += ExtractionDetails.ADAPTER.encodedSizeWithTag(1, installedAppsFragment.getExtractionDetails());
        }
        return Application.ADAPTER.asRepeated().encodedSizeWithTag(2, installedAppsFragment.getApplications()) + size;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        InstalledAppsFragment installedAppsFragment = (InstalledAppsFragment) obj;
        kotlin.jvm.internal.j.g(installedAppsFragment, numX49.tnTj78("bd56"));
        ExtractionDetails extractionDetails = installedAppsFragment.getExtractionDetails();
        return installedAppsFragment.copy(extractionDetails != null ? ExtractionDetails.ADAPTER.redact(extractionDetails) : null, Internal.m186redactElements(installedAppsFragment.getApplications(), Application.ADAPTER), ByteString.EMPTY);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) throws IOException {
        InstalledAppsFragment installedAppsFragment = (InstalledAppsFragment) obj;
        kotlin.jvm.internal.j.g(reverseProtoWriter, numX49.tnTj78("bd5h"));
        kotlin.jvm.internal.j.g(installedAppsFragment, numX49.tnTj78("bd5M"));
        reverseProtoWriter.writeBytes(installedAppsFragment.unknownFields());
        Application.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 2, installedAppsFragment.getApplications());
        if (installedAppsFragment.getExtractionDetails() != null) {
            ExtractionDetails.ADAPTER.encodeWithTag(reverseProtoWriter, 1, installedAppsFragment.getExtractionDetails());
        }
    }
}
