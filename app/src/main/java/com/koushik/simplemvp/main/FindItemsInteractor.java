/*
 *
 *  * Copyright (C) 2018 Antonio Leiva Gordillo.
 *  *
 *  * Licensed under the Apache License, Version 2.0 (the "License");
 *  * you may not use this file except in compliance with the License.
 *  * You may obtain a copy of the License at
 *  *
 *  *      http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  * Unless required by applicable law or agreed to in writing, software
 *  * distributed under the License is distributed on an "AS IS" BASIS,
 *  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  * See the License for the specific language governing permissions and
 *  * limitations under the License.
 *
 */

package com.koushik.simplemvp.main;

import android.os.Handler;

import java.util.Arrays;
import java.util.List;

public class FindItemsInteractor {

    interface OnFinishedListener {
        void onFinished(List<ItemModel> items);
    }

    public void findItems(final OnFinishedListener listener,List<ItemModel> list) {
        new Handler().postDelayed(() -> listener.onFinished(getResponseList(list)), 2000);
    }

    private List<ItemModel> getResponseList(List<ItemModel> list) {

         list.add(new ItemModel("Item "+(list.size()+1)));
         return list;
    }
}
