/*
 * This file is part of "hybris integration" plugin for Intellij IDEA.
 * Copyright (C) 2014-2016 Alexander Bartash <AlexanderBartash@gmail.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */

// This is a generated file. Not intended for manual editing.
package com.intellij.idea.plugin.hybris.flexibleSearch.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.idea.plugin.hybris.flexibleSearch.psi.FlexibleSearchCorrelationName;
import com.intellij.idea.plugin.hybris.flexibleSearch.psi.FlexibleSearchQuerySpecification;
import com.intellij.idea.plugin.hybris.flexibleSearch.psi.FlexibleSearchSubquery;
import com.intellij.idea.plugin.hybris.flexibleSearch.psi.FlexibleSearchVisitor;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

import static com.intellij.idea.plugin.hybris.flexibleSearch.psi.FlexibleSearchTypes.LEFT_DOUBLE_BRACE;
import static com.intellij.idea.plugin.hybris.flexibleSearch.psi.FlexibleSearchTypes.RIGHT_DOUBLE_BRACE;

public class FlexibleSearchSubqueryImpl extends ASTWrapperPsiElement implements FlexibleSearchSubquery {

    public FlexibleSearchSubqueryImpl(ASTNode node) {
        super(node);
    }

    public void accept(@NotNull FlexibleSearchVisitor visitor) {
        visitor.visitSubquery(this);
    }

    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof FlexibleSearchVisitor) {
            accept((FlexibleSearchVisitor) visitor);
        } else {
            super.accept(visitor);
        }
    }

    @Override
    @Nullable
    public FlexibleSearchCorrelationName getCorrelationName() {
        return findChildByClass(FlexibleSearchCorrelationName.class);
    }

    @Override
    @NotNull
    public FlexibleSearchQuerySpecification getQuerySpecification() {
        return findNotNullChildByClass(FlexibleSearchQuerySpecification.class);
    }

    @Override
    @NotNull
    public List<FlexibleSearchSubquery> getSubqueryList() {
        return PsiTreeUtil.getChildrenOfTypeAsList(this, FlexibleSearchSubquery.class);
    }

    @Override
    @NotNull
    public PsiElement getLeftDoubleBrace() {
        return findNotNullChildByType(LEFT_DOUBLE_BRACE);
    }

    @Override
    @NotNull
    public PsiElement getRightDoubleBrace() {
        return findNotNullChildByType(RIGHT_DOUBLE_BRACE);
    }

}
