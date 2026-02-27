package com.dynatrace.android.agent.comm;

/* JADX INFO: loaded from: classes2.dex */
public class CommunicationProblemListenerTask implements Runnable {
    private CommunicationProblemListener communicationProblemListener;
    private Throwable throwable;

    public CommunicationProblemListenerTask(CommunicationProblemListener communicationProblemListener, Throwable th2) {
        this.communicationProblemListener = communicationProblemListener;
        this.throwable = th2;
    }

    @Override // java.lang.Runnable
    public void run() {
        Throwable th2 = this.throwable;
        if (!(th2 instanceof InvalidResponseException)) {
            this.communicationProblemListener.onError(th2);
        } else {
            HttpResponse response = ((InvalidResponseException) th2).getResponse();
            this.communicationProblemListener.onFailure(response.responseCode, response.responseMessage, response.body);
        }
    }
}
