package com.mysite.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;

import javax.inject.Inject;
import java.util.List;

@Model(adaptables = Resource.class, adapters = Title.class)
public class MultifieldTestImpl implements MultifieldTest{

    @Inject
    List<Title> titles;

    @Override
    public List<Title> getTitles() {
        return titles;
    }
}
