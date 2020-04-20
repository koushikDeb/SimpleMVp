

package com.koushik.simplemvp.main;

import java.util.List;

public interface MainView {

    void showProgress();

    void hideProgress();

    void setItems(List<ItemModel> items);

    void showMessage(String message);
}