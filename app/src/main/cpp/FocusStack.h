//
// Created by yeuchi on 4/4/21.
//

#ifndef FOCUSSTACK_FOCUSSTACK_H
#define FOCUSSTACK_FOCUSSTACK_H

class FocusStack {
public:
    FocusStack();
    ~FocusStack();

public:
    int Combine(AndroidBitmapInfo infoSource,
                void* pixelsSource,
                AndroidBitmapInfo infoResult,
                void* pixelsResult);
};

#endif //FOCUSSTACK_FOCUSSTACK_H
