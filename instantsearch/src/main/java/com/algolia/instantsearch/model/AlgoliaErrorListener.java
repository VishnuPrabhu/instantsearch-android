package com.algolia.instantsearch.model;

import android.support.annotation.NonNull;

import com.algolia.search.saas.AlgoliaException;
import com.algolia.search.saas.Query;

/**
 * Lets you define a component that will react to search errors.
 */
public interface AlgoliaErrorListener {
    /**
     * Reacts to potential search errors.
     *
     * @param query the {@link Query} that was used.
     * @param error the resulting {@link AlgoliaException}.
     */
    void onError(@NonNull final Query query, @NonNull final AlgoliaException error);
}