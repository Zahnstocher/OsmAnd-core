#include "RasterizedSymbolOnPath.h"

OsmAnd::RasterizedSymbolOnPath::RasterizedSymbolOnPath(
    const std::shared_ptr<const RasterizedSymbolsGroup>& group_,
    const std::shared_ptr<const Model::MapObject>& mapObject_,
    const std::shared_ptr<const SkBitmap>& bitmap_,
    const int order_,
    const QString& content_,
    const QVector<SkScalar>& glyphsWidth_)
    : RasterizedSymbol(group_, mapObject_, bitmap_, order_, content_)
    , glyphsWidth(glyphsWidth_)
{
}

OsmAnd::RasterizedSymbolOnPath::~RasterizedSymbolOnPath()
{
}