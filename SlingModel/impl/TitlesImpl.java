package com.mysite.core.models.impl;

import com.mysite.core.models.Title;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.osgi.resource.Resource;

import javax.inject.Inject;

@Model(adaptables = Resource.class, adapters = Title.class)
public class TitlesImpl implements Title {

    @Inject
    String language;

    @Inject
    String date;

    @Override
    public String getLanguage() {
        return language;
    }

    @Override
    public String getDate() {
        return date;
    }
}
