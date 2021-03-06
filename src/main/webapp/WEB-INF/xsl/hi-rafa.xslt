<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
                version="1.0">
    <xsl:output method="html" doctype-system="about:legacy-compat"/>
    <!-- This allows generation of <!DOCTYPE html SYSTEM "about:legacy-compat"> for HTML5 -->
    <xsl:template match="/">
        <html lang="en">
            <head>
                <title>XML Data parsing</title>
                <meta charset="utf-8"/>
                <meta name="viewport" content="width=device-width, initial-scale=1"/>
                <link rel="stylesheet"
                      href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"/>
            </head>
            <body>
                <div class="container">
                    <xsl:apply-templates/>
                </div>
            </body>
        </html>
    </xsl:template>
    <xsl:template match="msg">
        <h1>
            <xsl:value-of select="."/>
        </h1>
    </xsl:template>
</xsl:stylesheet>