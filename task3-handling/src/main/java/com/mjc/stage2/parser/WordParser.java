package com.mjc.stage2.parser;


import com.mjc.stage2.Tokenizer;
import com.mjc.stage2.entity.AbstractTextComponent;
import com.mjc.stage2.entity.SymbolLeaf;
import com.mjc.stage2.entity.TextComponent;
import com.mjc.stage2.entity.TextComponentType;

import java.util.List;
import java.util.Objects;

public class WordParser extends AbstractTextParser{

    private static final String LEXEME_REGEX = "\\S"; //""[\\w!=?()\\.':]";


    @Override
    public void parse(AbstractTextComponent abstractTextComponent, String string) {
        Tokenizer.getMatches(LEXEME_REGEX, string)
            .forEach(part -> {
                abstractTextComponent.add(new SymbolLeaf(null, part.charAt(0)));
            });
    }
}


